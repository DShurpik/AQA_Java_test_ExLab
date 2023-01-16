package BasePage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Driver.SimpleDriver.getDriver;
import static Utils.Config.WEB_DRIVER_WAIT;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BasePage() {
        driver = getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(WEB_DRIVER_WAIT));
        actions = new Actions(driver);
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

    protected void moveTo(By locator) {
        actions.scrollToElement(driver.findElement(locator)).build().perform();
    }

}
