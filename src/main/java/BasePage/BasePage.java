package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Driver.SimpleDriver.getDriver;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        driver = getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    protected void loadPage(String url) {
        driver.get(url);
    }

    protected void isDisplayed(By locator) {
        System.out.println("Element " + driver.findElement(locator).toString() + " is displayed");
        Assert.assertTrue(driver.findElement(locator).isDisplayed());
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

}
