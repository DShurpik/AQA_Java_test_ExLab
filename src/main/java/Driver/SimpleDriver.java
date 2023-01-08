package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SimpleDriver {

    protected static WebDriver driver;

    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(getChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeWebDriver() {
        driver.quit();
    }

    protected static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--window-size=1440,900");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1920,1080");
        return chromeOptions;
    }

}
