import BasePage.BaseTest;

import io.qameta.allure.Story;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static ExlabPages.LandingPage.*;

public class LandingPageDataProvider extends BaseTest {

    @Story("For Test after video")
    @Test(dataProvider = "Locators")
    public void test41_50(By locator) {
        landingPage.open()
                .scrollHalfPastPage();
        Assert.assertTrue(landingPage.elementIsDisplayed(locator));
    }


    @DataProvider(name = "Locators")
    public Object[][] getData(){
        return new Object[][]{
                {getLogoOnFooter()},
                {getTextUnderLogoFooter()},
                {getLinkedInOnFooter()},
                {getInstagramOnFooter()},
                {getTelegramOnFooter()},
                {getYoutubeOnFooter()},
                {getInfoOnFooter()}
        };
    }
}
