import BasePage.BaseTest;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static Driver.SimpleDriver.*;
import static ExlabPages.LandingPage.*;


public class LandingPageTest extends BaseTest {

    @Test(description = "Check landing available to address")
    public void test1_1() {
        landingPage.open();
        Assert.assertEquals(landingPage.getUrl(), "http://test.exlab.team/");
    }

    @Test(description = "Check landing available to address")
    public void test1_2() {
        landingPage.open();
        Assert.assertEquals(landingPage.getTitle(), "ExLab Landing");
    }

    @Test(description = "Page opens with dark background, check element")
    public void test2_1() {
        landingPage.open();
        Assert.assertTrue(landingPage.sunElementIsDisplayedBoolean());
    }

    @Test(description = "Page opens with dark background, check class webelement")
    public void test2_2() {
        landingPage.open();
        Assert.assertEquals(landingPage.sunElementGetClassName(), "sc-fnykZs fEkGUM");
    }

    @Test(description = "Page opens with dark background, check background color")
    public void test2_3() {
        landingPage.open();
        Assert.assertEquals(landingPage.getColor(), "rgba(17, 17, 17, 1)");
    }

    @Test(description = "ExLab logo is displayed")
    public void test3() {
        landingPage.open();
        Assert.assertTrue(landingPage.exlabLogoIsDisplayed());
    }

    @Test(description = "Menu item About us is displayed")
    public void test4() {
        landingPage.open();
        Assert.assertTrue(landingPage.aboutUsInHeaderIsDisplayed());
    }

    @Test(description = "About us menu link opens About us module")
    public void test5() {
        landingPage.open();
        Assert.assertTrue(landingPage.aboutUsInHeaderIsClicable());
        landingPage.moveToAboutUsOnPage();
        Assert.assertTrue(landingPage.aboutUsInHeaderOnPageIsDisplayed());
    }

    @Test(description = "Menu item Projects on header is displayed")
    public void test6() {
        landingPage.open();
        Assert.assertTrue(landingPage.projectHeaderIsDisplayed());
    }

    @Test(description = "Menu item Projects opens Projects module")
    public void test7() {
        landingPage.open();
        Assert.assertTrue(landingPage.projectHeaderIsClicable());
        landingPage.clickProjectsHeader();
        Assert.assertTrue(landingPage.projectHeaderOnPageIsDisplayed());
    }

    @Test(description = "Menu item Mentors is displayed")
    public void test8() {
        landingPage.open();
        Assert.assertTrue(landingPage.mentorsHeaderIsDisplayed());
    }

    @Test(description = "Menu item Mentors is displayed")
    public void test9() {
        landingPage.open().scrollAllPage();
        Assert.assertTrue(landingPage.mentorsHeaderIsClickable());
        landingPage.clickMentorsHeader();
        Assert.assertTrue(landingPage.mentorsOnPageIsDisplayed());
    }

    @Test(description = "Menu item StartUp is displayed")
    public void test10() {
        landingPage.open();
        Assert.assertTrue(landingPage.startUpForHeaderIsDisplayed());
    }

    @Test(description = "Menu item StartUp opens Start up module")
    public void test11() {
        landingPage.open().scrollAllPage();
        Assert.assertTrue(landingPage.startUpForHeaderIsClickable());
        landingPage.clickStartUpForHeader();
        Assert.assertTrue(landingPage.startUpForOnPageIsDisplayed());
    }

    @Test(description = "Button Sun Icon is displayed")
    public void test12() {
        landingPage.open();
        Assert.assertTrue(landingPage.sunElementIsDisplayed());
    }

    @Test(description = "Button Sun Icon changes on new element and check")
    public void test13_V1() {
        landingPage.open();
        Assert.assertTrue(landingPage.sunElementIsDisplayed());
        landingPage.clickOnSunElement();
        Assert.assertTrue(landingPage.moonElementIsDisplayed());
    }

    @Test(description = "Button Sun Icon changes background color")
    public void test13_V2() {
        landingPage.open();
        Assert.assertEquals(landingPage.getColor(), "rgba(17, 17, 17, 1)");
        landingPage.clickOnSunElement();
        Assert.assertEquals(landingPage.getColorPageWhite(), "rgba(255, 255, 255, 1)");
    }

    @Test(description = "Button Sun Icon changes class name")
    public void test13_V3() {
        landingPage.open();
        Assert.assertEquals(landingPage.sunElementGetClassName(), "sc-fnykZs fEkGUM");
        landingPage.clickOnSunElement();
        Assert.assertEquals(landingPage.moonElementGetClassName(), "sc-fnykZs lfkjFc");
    }

    @Test(description = "Join button is displayed")
    public void test14() {
        landingPage.open();
        Assert.assertTrue(landingPage.connectBtnInHeaderDisplayed());
    }

    @Test(description = "Join button opens telegram inviting page")
    public void test15() {
        landingPage.open()
                .connectBtnInHeaderClick()
                .navigateTo();
        Assert.assertEquals(landingPage.telegramUrlIsExpected(), "https://t.me/ExLab_registration_bot");
    }

    @Test(description = "About Us header is displayed")
    public void test16() {
        landingPage.open()
                .moveToAboutUsOnPage();
        Assert.assertTrue(landingPage.aboutUsOnPageIsDisplayed());
    }

    @Test(description = "About Us text is displayed")
    public void test17() {
        landingPage.open()
                .moveToAboutUsText();
        Assert.assertTrue(landingPage.textUnderAboutUsOnPageIsDisplayed());
    }

    @Test(description = "Why ExLab subheader is displayed")
    public void test18() {
        landingPage.open()
                .moveToWhyExlabOnPage();
        Assert.assertTrue(landingPage.subheaderWhyExlabOnPageIsDisplayed());
    }

    @Test(description = "Why ExLab text is displayed")
    public void test19() {
        landingPage.open()
                .moveTotextUnderWhyExlabOnPage();
        Assert.assertTrue(landingPage.textUnderWhyExlabOnPageIsDisplayed());
    }

    @Test(description = "Join button is displayed")
    public void test20() {
        landingPage.open()
                .moveToJoinBtnOnPage();
        Assert.assertTrue(landingPage.joinBtnOnPageDisplayed());
    }

    @Test(description = "Join button opens telegram inviting page")
    public void test21() {
        landingPage.open()
                .cliclOnJoinBtnOnPage()
                .navigateTo();
        Assert.assertEquals(landingPage.telegramUrlIsExpected(), "https://t.me/ExLab_registration_bot");
    }

    @Test(description = "Projects header is displayed")
    public void test22() {
        landingPage.open()
                .moveToprojectOnPage();
        Assert.assertTrue(landingPage.projectOnPageIsDisplayed());
    }

    @Test(description = "ExLab logo is displayed at Projects module")
    public void test23_1() {
        landingPage.open()
                .moveToExlabLogoOnProjectModule();
        Assert.assertTrue(landingPage.exlabLogoOnProjectModuleIsDisplayed());
    }

    @Test(description = "HealthyLife logo is displayed at Projects module")
    public void test23_2() {
        landingPage.open()
                .moveTohealthyLifeLogoOnProjectModule();
        Assert.assertTrue(landingPage.healthyLifeLogoOnProjectModuleIsDisplayed());
    }

    @Test(description = "Easyhelp logo is displayed at Projects module")
    public void test23_3() {
        landingPage.open()
                .moveToEasyhelpLogoOnProjectModule();
        Assert.assertTrue(landingPage.easyhelpLogoOnProjectModuleIsDisplayed());
    }

    @Test(description = "ExLab text is displayed at Projects module")
    public void test24_1() {
        landingPage.open()
                .moveToExlabTextOnProject();
        Assert.assertTrue(landingPage.exlabTextOnProjectIsDisplayed());
    }

    @Test(description = "HealthyLife text is displayed at Projects module")
    public void test24_2() {
        landingPage.open()
                .moveToHealthyLifeTextOnProject();
        Assert.assertTrue(landingPage.healthyLifeTextOnProjectIsDisplayed());
    }

    @Test(description = "Easyhelp text is displayed at Projects module")
    public void test24_3() {
        landingPage.open()
                .moveToEasyhelpTextOnProject();
        Assert.assertTrue(landingPage.easyhelpTextOnProjectIsDisplayed());
    }

    @Test(description = "Mentors header is displayed")
    public void test25() {
        landingPage.open()
                .scrollAllPage()
                .moveToMentorsHeaderOnPage();
        Assert.assertTrue(landingPage.mentorsHeaderOnPageIsDisplayed());
    }

    @Test(description = "Mentors info opens by + click")
    public void test26() {
        landingPage.open()
                .moveToMentorsHarlapInfo();
        Assert.assertTrue(landingPage.mentorsHeaderOnPageIsDisplayed());
        landingPage
                .openMentorsHarlapInfo()
                .moveToMentorsHarlapInfo1();
        Assert.assertTrue(landingPage.infoAboutMentorsHarlapIsDisplayedAfterOpen());
    }

    @Test(description = "Mentors foto is displayed")
    public void test27() {
        landingPage.open()
                .moveToMentorsHeaderOnPage();
        Assert.assertTrue(landingPage.mentorsHeaderOnPageIsDisplayed());
        landingPage
                .openMentorsInfoUdaev();
        Assert.assertTrue(landingPage.photoMentorsUdaevIsDisplayed());
    }

    @Test(description = "Info about 4 mentors is displayed")
    public void test28() {
        landingPage.open().moveToMentorsHeaderOnPage();
        Assert.assertTrue(landingPage.mentorsHeaderOnPageIsDisplayed());
        Assert.assertEquals(landingPage.countMentorsName(), 4);
    }

    @Test(description = "Mentors info is closed by clicking -")
    public void test29() {
        landingPage.open()
                .scrollAllPage()
                .moveToMentorsHeaderOnPage();
        Assert.assertTrue(landingPage.mentorsHeaderOnPageIsDisplayed());
        landingPage
                .openMentorsInfoUdaev();
        Assert.assertTrue(landingPage.photoMentorsUdaevIsDisplayed());
        landingPage.closeMentorsInfoUdaev();
        Assert.assertFalse(landingPage.photoUdaevIsNotDisplayed());
    }

    @Test(description = "Became mentor button is displayed")
    public void test30() {
        landingPage.open()
                .moveToBecameMentorButton();
        Assert.assertTrue(landingPage.becomeMentorIsDisplayed());
    }

    @Test(description = "Отображение надписи StartUp для ")
    public void test31() {
        landingPage.open()
                .scrollAllPage()
                .moveToStartUpForOnPage();
        Assert.assertTrue(landingPage.startUpForOnPageIsDisplayed());


    }

    @Test(description = "Отображение текста в блоке Juniors")
    public void test32_1() {
        landingPage.open()
                .scrollAllPage()
                .moveToStartUpForTextJuniors();
        Assert.assertTrue(landingPage.textStartUpForIsDisplayed());
    }

    @Test(description = "Отображение текста в блоке рекрутеров")
    public void test32_2() {
        landingPage.open()
                .scrollAllPage()
                .moveToStartUpForTextHR();
        Assert.assertTrue(landingPage.textStartUpForHRIsDisplayed());
    }

    @Test(description = "Отображение кнопки [Найти специалиста]")
    public void test33() {
        landingPage.open()
                .scrollAllPage()
                .moveToSearchCandidate();
        Assert.assertTrue(landingPage.searchCandidateBtnIsDisplayed());
    }

    @Test(description = "Отображение надписи Помочь проекту")
    public void test34() {
        landingPage.open()
                .scrollAllPage()
                .moveToHelpProjectOnPage();
        Assert.assertTrue(landingPage.helpProjectOnPageIsDisplayed());
    }

    @Test(description = "Отображение текста в блоке ")
    public void test35() {
        landingPage.open()
                .scrollAllPage()
                .moveToTextOnHelpProjectOnPage();
        Assert.assertTrue(landingPage.textOnHelpProjectOnPageIsDisplayed());
    }

    @Test(description = "Отображение кнопки [Boosty]")
    public void test36() {
        landingPage.open()
                .scrollAllPage()
                .moveToBoostyBtn();
        Assert.assertTrue(landingPage.boostyBtnIsDisplayed());
    }

    @Test(description = "-При нажатии на кнопку  [Boosty] открывается страница ExLab на сайте Boosty")
    public void test37() {
        landingPage.open()
                .scrollAllPage()
                .moveToBoostyBtn()
                .clickOnBoostyBtn()
                .navigateTo();
        Assert.assertTrue(landingPage.titleOnBoostyIsDisplayed());
    }

    @Test(description = "Отображение кнопки [Patreon]")
    public void test38() {
        landingPage.open()
                .scrollAllPage()
                .moveToPatreonBtn();
        Assert.assertTrue(landingPage.patreonBtnIsDisplayed());
    }

    @Test(description = "Отображение надписи Оставайся на связи")
    public void test39() {
        landingPage.open()
                .scrollAllPage()
                .moveToStayInConnection();
        Assert.assertTrue(landingPage.stayOnConnectionIsDisplayed());
    }

    @Test(description = "Отображение текста в блоке ")
    public void test40() {
        landingPage.open()
                .scrollAllPage()
                .moveToStayInConnectionBlockText();
        Assert.assertTrue(landingPage.stayOnConnectionTextOnBlockIsDisplayed());
    }

    @Test(dataProvider = "Locators")
    public void test41_51_from_dataprovider(Integer id_test, By locator) {
        landingPage.open()
                .scrollHalfPastPage();
        Assert.assertTrue(landingPage.elementIsDisplayed(locator));
    }


    @DataProvider(name = "Locators")
    public Object[][] getData(){
        return new Object[][]{
                {41, getLogoOnFooter()},
                {42, getTextUnderLogoFooter()},
                {43, getLinkedInOnFooter()},
                {45, getInstagramOnFooter()},
                {47, getTelegramOnFooter()},
                {49, getYoutubeOnFooter()},
                {51, getInfoOnFooter()}
        };
    }

    @Test(dataProvider = "For test 44-50")
    public void test44_46_48_50(Integer id_test, By locator1, By locator2) {
        landingPage.open().scrollHalfPastPage().click_(locator1);
        landingPage.navigateTo();

        Assert.assertTrue(landingPage.isDisplayed_(locator2));
    }

    @DataProvider(name = "For test 44-50")
    public Object[][] getDataForTest44_40(){
        return new Object[][]{
                {44, getLinkedInOnFooter(), getLinkedIn()},
                {46, getInstagramOnFooter(), getInstagram()},
                {48, getTelegramOnFooter(), getTelegram()},
                {50, getYoutubeOnFooter(), getYoutube()}
        };
    }


    //@Test(enabled = false)
    public void testWithFor() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        WebDriver driver = getDriver();
        landingPage.open();
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='sc-fEOsli iema-Dv']"));
        for (int i = 0; i < elements.size(); i++){
            Thread.sleep(500);
            js.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
        }
        Thread.sleep(500);
        for (int i = 6; i > 0; i--){
            Thread.sleep(500);
            js.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
        }
        WebElement header = driver.findElement(By.xpath("//div[@class='sc-fEOsli iema-Dv']/div[@id='header']"));
        js.executeScript("arguments[0].scrollIntoView(true);", header);
        Thread.sleep(500);

        Assert.assertTrue(landingPage.startUpForHeaderIsClickable());
        landingPage.clickStartUpForHeader();
        Assert.assertTrue(landingPage.startUpForOnPageIsDisplayed());
    }

}
