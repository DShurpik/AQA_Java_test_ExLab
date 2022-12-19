import BasePage.BaseTest;
import ExlabPages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Driver.SimpleDriver.*;


public class test extends BaseTest {

    @Test(description = "Check landing available to address")
    public void test1() {
        new LandingPage()
                .open("http://exlab.team/")
                .checkTitle("ExLab Landing");
    }

    @Test(description = "Default open dark themes")
    public void test1_1() {
        new LandingPage()
                .open("http://exlab.team/")
                .sunElementIsDisplayed();
    }

    @Test(description = "Check background color")
    public void test1_2() {
        new LandingPage()
                .open("http://exlab.team/")
                .checkColorDark("rgba(17, 17, 17, 1)");
    }

    @Test(description = "Logo ExLab is displayed")
    public void test2() {
        new LandingPage()
                .open("http://exlab.team/")
                .titleDarkIsDisplayed();
    }

    @Test(description = "About us is displayed and navigate to about us title")
    public void test3() {
        new LandingPage()
                .open("http://exlab.team/")
                .aboutUsIsDisplayed()
                .clickOnAboutUs()
                .aboutUsNavigateTo();;
    }

    @Test(description = "Projects us is displayed and navigate to projects title")
    public void test4() {
        new LandingPage()
                .open("http://exlab.team/")
                .projectHeaderIsDisplayed()
                .clickProjectsHeader()
                .projectNavigateTo();
    }

    @Test(description = "Mentors is displayed and check navigate to mentors")
    public void test5() {
        new LandingPage()
                .open("http://exlab.team/")
                .mentorsHeaderIsDisplayed()
                .clickMentorsHeader()
                .mentorsNavigateTo();
    }

    @Test(description = "StartUp for is displayed and check navigate to StartUp")
    public void test6() {
        new LandingPage()
                .open("http://exlab.team/")
                .startUpForHeaderIsDisplayed()
                .clickStartUpForHeader()
                .startUpForNavigateTo();
    }

    @Test(description = "Check Sun Icon and check white themes after click")
    public void test7_1() {
        new LandingPage()
                .open("http://exlab.team/")
                .sunElementIsDisplayed()
                .clickOnSunElement()
                .moonElementIsDisplayed();
    }

    @Test(description = "Check Sun Icon and check white themes after click")
    public void test7_2() {
        new LandingPage()
                .open("http://exlab.team/")
                .sunElementIsDisplayed()
                .checkColorDark("rgba(17, 17, 17, 1)")
                .clickOnSunElement()
                .checkColorWhite("rgba(255, 255, 255, 1)");
    }



    @Test(enabled = false)
    public void test10() {
        WebDriver driver = getDriver();
        driver.get("http://exlab.team/");
        Actions action = new Actions(driver);
        action.scrollToElement(driver.findElement(By.xpath("//div[@class='sc-fIavCj fEzmxG']"))).build().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='sc-fIavCj fEzmxG']")).isDisplayed());
    }

    @Test(enabled = false)
    public void test11() {
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
}
