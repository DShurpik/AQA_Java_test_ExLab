import BasePage.BaseTest;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Driver.SimpleDriver.*;


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
        landingPage.open();
        Assert.assertTrue(landingPage.mentorsHeaderIsClickable());
        landingPage.clickMentorsHeader();
        Assert.assertTrue(landingPage.mentorsOnPageIsDisplayed());
    }

    @Test(description = "Menu item StartUp is displayed")
    public void test10() {
        landingPage.open();
        Assert.assertTrue(landingPage.startUpForHeaderIsDisplayed());
    }

    @Test(description = "Menu item StartUp opens Start up module", priority = 2)
    public void test11() {
        landingPage.open();
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
                .moveToMentorsHeaderOnPage();
        Assert.assertTrue(landingPage.mentorsHeaderOnPageIsDisplayed());
    }

    @Test(description = "Mentors info opens by + click")
    public void test26() {
        landingPage.open()
                .moveToMentorsHarlapInfo();
        Assert.assertTrue(landingPage.mentorsHeaderOnPageIsDisplayed());
        landingPage
                .openMentorsHarlapInfo();
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





    @Test(enabled = false)
    public void test22222_3() {
        WebDriver driver = getDriver();
        driver.get("http://exlab.team/");
        driver.findElement(By.partialLinkText("О нас")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String trans = driver.findElement(By.xpath("//div[@class='sc-bczRLJ ckyTig']")).getAttribute("style");
        System.out.println(trans);
        String expectedRes = "transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -1084, 0, 1); opacity: 1; pointer-events: all;";
        Assert.assertEquals(trans, expectedRes);
    }


}