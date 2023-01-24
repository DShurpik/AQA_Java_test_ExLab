package BasePage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static Driver.SimpleDriver.getDriver;
import static Utils.Config.WEB_DRIVER_WAIT;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    protected JavascriptExecutor js;

    public BasePage() {
        driver = getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(WEB_DRIVER_WAIT));
        actions = new Actions(driver);
        js = (JavascriptExecutor) driver;
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

    protected void scroll() throws InterruptedException {
        List<WebElement> elements = new ArrayList<WebElement>();
        elements.add(driver.findElement(By.xpath("//div[@class='sc-bjUoiL gdftMO']"))); // с логотипом
        elements.add(driver.findElement(By.xpath("//div[@class='sc-ikZpkk fAmEjI']"))); // о нас
        elements.add(driver.findElement(By.xpath("//div[@class='sc-kgUAyh hgIA-Dr']"))); // проекты
        elements.add(driver.findElement(By.xpath("//div[@class='sc-GVOUr heJycm']"))); // менторы
        elements.add(driver.findElement(By.xpath("//div[@class='sc-jfmDQi jtqNlU']"))); // juniors
        elements.add(driver.findElement(By.xpath("//div[@class='sc-ehmTmK hNtRAb']"))); // HR
        elements.add(driver.findElement(By.xpath("//div[@class='sc-cZwWEu iorPTp']"))); // HELP
        elements.add(driver.findElement(By.xpath("//div[@class='sc-tsFYE hcwyLm']"))); // CONNECT
        for (int i = 0; i < elements.size(); i++){
            Thread.sleep(500);
            js.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
        }
        Thread.sleep(500);
        for (int i = 7; i > 0; i--){
            Thread.sleep(500);
            js.executeScript("arguments[0].scrollIntoView(true);", elements.get(i));
        }
        WebElement header = driver.findElement(By.xpath("//div[@class='sc-fEOsli iema-Dv']/div[@id='header']"));
        js.executeScript("arguments[0].scrollIntoView(true);", header);
        Thread.sleep(500);
    }

}
