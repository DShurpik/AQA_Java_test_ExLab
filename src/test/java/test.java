import BasePage.BaseTest;
import ExlabPages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Driver.SimpleDriver.*;


public class test extends BaseTest {

    @Test
    public void test1() {
        WebDriver driver = getDriver();
        driver.get("http://exlab.team/");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='sc-fnykZs fEkGUM']")).isDisplayed());

        //Assert.assertTrue(driver.findElement(nightIcon).isDisplayed());

        driver.findElement(By.xpath("//div[@class='sc-fnykZs fEkGUM']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='sc-fnykZs lfkjFc']")).isDisplayed(), "ERROR");
    }

    @Test
    public void test2() {
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

    @Test
    public void test3() {
        WebDriver driver = getDriver();
        driver.get("http://exlab.team/");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='logo_mobile'][1]")).isDisplayed());
    }

    @Test
    public void test4() {
        new LandingPage()
                .open("http://exlab.team/")
                .sunElementIsDisplayed();
    }

}
