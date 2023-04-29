import BasePage.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static ExlabPages.LandingPage_ref.*;

public class LandingPageTest_ref extends BaseTest {

    @Test(description = "Check landing available to address")
    public void test1_1() {
        landingPage_ref.open();
        Assert.assertEquals(landingPage_ref.getUrl(), "http://test.exlab.team/");
    }

    @Test(description = "Check landing available to address")
    public void test1_2() {
        landingPage_ref.open();
        Assert.assertEquals(landingPage_ref.getTitle(), "ExLab Landing");
    }

    @Test(description = "2,3,4,6,8,10,12,14", dataProvider = "For first tests")
    public void test2_3_4_6_8_10_12_14(Integer id_test, By locator) {
        landingPage_ref.open();
        Assert.assertTrue(landingPage_ref.elementIsDisplayed(locator));
    }

    @DataProvider(name = "For first tests")
    public Object[][] getData1() {
        return new Object[][] {
                {2, getSunElement()},
                {3, getExlabLogoDark()},
                {4, getAboutUsHeader()},
                {6, getProjectstHeader()},
                {8, getMentorsHeader()},
                {10, getStartUpForHeader()},
                {12, getSunElement()},
                {14, getconnectBtnInHeader()}
        };
    }

    @Test(dataProvider = "For second tests" ,description = "5,16,17,18,19,20,22,23_1,23_2,23_3,24_1,24_2,24_3,25,30,31,32_1,32_2,33,34,35,36,38,39,40")
    public void tests_5_40(Integer id_test, By locator) {
        landingPage_ref.open()
                .scrollAllPage()
                .movingTo(locator);
        Assert.assertTrue(landingPage_ref.elementIsDisplayed(locator));
    }

    @DataProvider(name = "For second tests")
    public Object[][] getData2() {
        return new Object[][] {
                {16, getAboutUsOnPage()},
                {17, getTextUnderAboutUsOnPage()},
                {18, getWhyExlabOnPage()},
                {19, getTextUnderWhyExlabOnPage()},
                {20, getJoinBtnOnPage()},
                {22, getProjectOnPage()},
                {23_1, getExlabImgOnProject()},
                {23_2, getHealthyLifeImgOnProject()},
                {23_3, getEasyhelpImgOnProject()},
                {24_1, getTextOnExlabOnProject()},
                {24_2, getTextOnHealthyLifeOnProject()},
                {24_3, getTextOnEasyHelpOnProject()},
                {25, getMentorsOnPage()},
                {30, getBecomeMentor()},
                {31, getStartUpOnPage1()},
                {32_1, getTextOnStartUpForJuniors()},
                {32_2, getTextOnStartUpForHR()},
                {33, getSearchCandidateOnPageBtn()},
                {34, getHelpProjectOnPage()},
                {35, getTextOnHelpProject()},
                {36, getBoostyBTN()},
                {38, getPatreonBTN()},
                {39, getStayInConnectionOnPAge()},
                {40, getTextInStayOnConnection()}
        };
    }
}
