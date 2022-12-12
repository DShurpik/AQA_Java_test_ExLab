package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static Driver.SimpleDriver.getDriver;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage() {
        driver = getDriver();
    }

    protected void loadPage(String url) {
        driver.get(url);
    }

    protected void isDisplayed(By locator) {
        Assert.assertTrue(driver.findElement(locator).isDisplayed());
    }

}
