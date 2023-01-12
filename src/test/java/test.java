import BasePage.BaseTest;
import ExlabPages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static Driver.SimpleDriver.*;


public class test extends BaseTest {

    @Test(description = "Check landing available to address")
    public void test1() {
        new LandingPage()
                .open()
                .checkTitle("ExLab Landing", "http://test.exlab.team/");
    }

    @Test(description = "Default open dark themes")
    public void test2_1() {
        new LandingPage()
                .open()
                .sunElementIsDisplayed();
    }

    @Test(description = "Check background color")
    public void test2_2() {
        new LandingPage()
                .open()
                .checkColorDark("rgba(17, 17, 17, 1)");
    }

    @Test(description = "Logo ExLab is displayed")
    public void test3() {
        new LandingPage()
                .open()
                .titleDarkIsDisplayed();
    }

    @Test(description = "About us is displayed and navigate to about us title")
    public void test4_5() {
        new LandingPage()
                .open()
                .aboutUsInHeaderIsDisplayed()
                .clickOnAboutUs()
                .aboutUsNavigateTo();
    }

    @Test(description = "Projects us is displayed and navigate to projects title")
    public void test6_7() {
        new LandingPage()
                .open()
                .projectHeaderIsDisplayed()
                .clickProjectsHeader()
                .projectNavigateTo();
    }

    @Test(description = "Mentors is displayed and check navigate to mentors")
    public void test8_9() {
        new LandingPage()
                .open()
                .mentorsHeaderIsDisplayed()
                .clickMentorsHeader()
                .mentorsNavigateTo();
    }

    @Test(description = "StartUp for is displayed and check navigate to StartUp")
    public void test10_11() {
        new LandingPage()
                .open()
                .startUpForHeaderIsDisplayed()
                .clickStartUpForHeader()
                .startUpForNavigateTo();
    }

    @Test(description = "Check Sun Icon and check white themes after click")
    public void test12_13_V1() {
        new LandingPage()
                .open()
                .sunElementIsDisplayed()
                .clickOnSunElement()
                .moonElementIsDisplayed();
    }

    @Test(description = "Check Sun Icon and check white themes after click")
    public void test12_13_V2() {
        new LandingPage()
                .open()
                .sunElementIsDisplayed()
                .checkColorDark("rgba(17, 17, 17, 1)")
                .clickOnSunElement()
                .checkColorWhite("rgba(255, 255, 255, 1)");
    }

    @Test(description = "Check connect button is displayed")
    public void test14() {
        new LandingPage()
                .open()
                .connectBtnInHeaderDisplayed();
    }

    @Test(description = "Check, if click connect button is invite in telegram")
    public void test15() {
        new LandingPage()
                .open()
                .connectBtnInHeaderClick()
                .navigateTo()
                .nameOfTelegramBotIsDisplayed();
    }

    @Test(description = "Check about us is displayed on page")
    public void test16() {
        new LandingPage()
                .open()
                .moveToAboutUsOnPage()
                .aboutUsOnPageIsDisplayed();
    }

    @Test(description = "Text under about us on page is displayed")
    public void test17() {
        new LandingPage()
                .open()
                .moveToAboutUsOnPage()
                .aboutUsOnPageIsDisplayed()
                .textUnderAboutUsOnPageIsDisplayed();
    }

    @Test(description = "Check Why ExLab is displayed")
    public void test18() {
        new LandingPage()
                .open()
                .textWhyExlabOnPageIsDisplayed();
    }

    @Test(description = "Check text under Why Exlab is displayed")
    public void test19() {
        new LandingPage()
                .open()
                .textUnderWhyExlabOnPageIsDisplayed();
    }

    @Test(description = "Check button Join is displayed")
    public void test20() {
        new LandingPage()
                .open()
                .joinBtnOnPageDisplayed();
    }

    @Test(description = "Check if click on join button open telegram bot")
    public void test21() {
        new LandingPage()
                .open()
                .cliclOnJoinBtnOnPage()
                .navigateTo()
                .nameOfTelegramBotIsDisplayed();
    }

    @Test(description = "Check project on page is displayed")
    public void test22() {
        new LandingPage()
                .open()
                .projectOnPageIsDisplayed();
    }

    @Test(description = "Check logos is displayed on project block")
    public void test23_1() {
        new LandingPage()
                .open()
                .exlabLogoOnProjectIsDisplayed();
    }

    @Test(description = "Check logos is displayed on project block")
    public void test23_2() {
        new LandingPage()
                .open()
                .healthyLifeLogoOnProjectIsDisplayed();
    }

    @Test(description = "Check logos is displayed on project block")
    public void test23_3() {
        new LandingPage()
                .open()
                .easyhelpOnProjectLogoIsDisplayed();
    }

    @Test(description = "Check all logos on project block")
    public void test23() {
        new LandingPage()
                .open()
                .checkImgOnProjectBlockIsDisplayed();
    }

    @Test(description = "Check all text on project block")
    public void test24() {
        new LandingPage()
                .open()
                .checkTextsOnProjectBlockIsDisplayed();
    }

    @Test(description = "ExLab text is displayed at Projects module")
    public void test24_1() {
        new LandingPage()
                .open()
                .exlabTextOnProjectIsDisplayed();
    }

    @Test(description = "HealthyLife text is displayed at Projects module")
    public void test24_2() {
        new LandingPage()
                .open()
                .healthyLifeTextOnProjectIsDisplayed();
    }

    @Test(description = "Easyhelp text is displayed at Projects module")
    public void test24_3() {
        new LandingPage()
                .open()
                .easyhelpTextOnProjectIsDisplayed();
    }

    @Test(description = "Mentors header is displayed")
    public void test25() {
        new LandingPage()
                .open()
                .mentorsHeaderOnPageIsDisplayed();
    }

    @Test(description = "Mentors info opens by + click")
    public void test26() {
        new LandingPage()
                .open()
                .mentorsHeaderOnPageIsDisplayed()
                .openMentorsInfo()
                .infoAboutMentorsIsDisplayedAfterOpen();
    }

    @Test(description = "Mentors foto is displayed")
    public void test27() {
        new LandingPage()
                .open()
                .mentorsHeaderOnPageIsDisplayed()
                .openMentorsInfoUdaev()
                .photoMentorsUdaevIsDisplayed();
    }

    @Test(description = "Info about 4 mentors is displayed")
    public void test28() {
        new LandingPage()
                .open()
                .mentorsHeaderOnPageIsDisplayed()
                .countMentorsName();
    }

    @Test(description = "Mentors info is closed by clicking -")
    public void test29() {
        new LandingPage()
                .open()
                .mentorsHeaderOnPageIsDisplayed()
                .openMentorsInfoUdaev()
                .photoMentorsUdaevIsDisplayed()
                .closeMentorsInfoUdaev()
                .photoUdaevIsNotDisplayed();
    }

    @Test(description = "Became mentor button is displayed")
    public void test30() {
        new LandingPage()
                .open()
                .becameMentorButtonIsDisplayed();
    }



    @Test(enabled = false)
    public void test10() {
        WebDriver driver = getDriver();
        driver.get("http://test.exlab.team/");
        Actions action = new Actions(driver);
        action.scrollToElement(driver.findElement(By.xpath("//div[@class='sc-eCYdqJ koNCEH' and contains(text(),'О нас')]"))).build().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='sc-eCYdqJ koNCEH' and contains(text(),'О нас')]")).isDisplayed());
    }

    @Test(enabled = false)
    public void test11__() {
        WebDriver driver = getDriver();
        driver.get("http://exlab.team/");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='sc-fIavCj fEzmxG']")).isEnabled());
    }

    @Test(enabled = false)
    public void test8() {
        WebDriver driver = getDriver();
        driver.get("http://exlab.team/");
        Actions action = new Actions(driver);
        action.scrollToElement(driver.findElement(By.xpath("//div[@class='sc-eCYdqJ koNCEH' and text()='О нас']"))).build().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='sc-eCYdqJ koNCEH' and text()='О нас']")).isDisplayed());
    }

    @Test(enabled = false)
    public void test9() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("http://exlab.team/");
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.scrollToElement(driver.findElement(By.xpath("//div[@class='sc-fIavCj fEzmxG']"))).build().perform();
        Thread.sleep(4000);
    }

    @Test(enabled = false)
    public void test2_3() {
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

    @Test(enabled = false)
    public void test_onliner() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("http://test.exlab.team/");
        Actions action = new Actions(driver);
        action.scrollToElement(driver.findElement(By.xpath("//div[@class='sc-fIavCj fEzmxG']"))).build().perform();
        Thread.sleep(6000);
    }

    @Test(enabled = false)
    public void scroll() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get("http://test.exlab.team/");
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        WebElement scroll = driver.findElement(By.xpath("//span[@class='c-scrollbar_thumb']"));
        System.out.println(scroll.getAttribute("style"));
        action.scrollToElement(driver.findElement(By.id("header"))).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("header"))));
        action.scrollToElement(driver.findElement(By.id("about"))).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("about"))));
        action.scrollToElement(driver.findElement(By.id("projects"))).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("projects"))));
        action.scrollToElement(driver.findElement(By.id("mentors"))).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("mentors"))));
        action.scrollToElement(driver.findElement(By.id("startup"))).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("startup"))));
        action.scrollToElement(driver.findElement(By.xpath("//div[@class='sc-cZwWEu iorPTp']"))).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='sc-cZwWEu iorPTp']"))));
        action.scrollToElement(driver.findElement(By.id("footer"))).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("footer"))));

        Assert.assertTrue(driver.findElement(By.id("mentors")).isDisplayed());


        System.out.println(scroll.getAttribute("style"));

        Thread.sleep(10000);
    }
}
