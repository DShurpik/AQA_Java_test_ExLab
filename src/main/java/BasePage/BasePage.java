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
        System.out.println("Element " + locator.toString() + " is displayed");
        Assert.assertTrue(driver.findElement(locator).isDisplayed());
    }

    protected void click(By locator) {
        System.out.println("Element " + locator.toString() + " click");
        driver.findElement(locator).click();
    }

    protected void moveTo(By locator) {
        System.out.println("Scroll to element " + locator.toString());
        actions.scrollToElement(driver.findElement(locator)).build().perform();
    }

}
