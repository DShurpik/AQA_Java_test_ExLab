package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

import static Utils.Config.*;

public class SimpleDriver {

    protected static WebDriver driver;

    public static void createDriver() {
        if (driver == null) {
            switch (BROWSER) {
                case "CHROME":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(getChromeOptions());
                    break;
                case "FIREFOX":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(getFirefoxOptions());
                    break;
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT));
            driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(SCRIPT_TIME_OUT));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
            driver.manage().window().setSize(DIMENSION);
            driver.manage().deleteAllCookies();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeWebDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    protected static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        if (ON_HEADLESS) {
        chromeOptions.addArguments("--headless");
        }
        return chromeOptions;
    }

    protected static FirefoxOptions getFirefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        if (ON_HEADLESS) {
            firefoxOptions.addArguments("--headless");
        }
        return firefoxOptions;
    }

}
