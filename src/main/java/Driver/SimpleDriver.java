package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static Utils.Config.*;

public class SimpleDriver {

    protected static WebDriver driver;

    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(getChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(SCRIPT_TIME_OUT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
        driver.manage().window().setSize(DIMENSION);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeWebDriver() {
        driver.quit();
    }

    protected static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        if (ON_HEADLESS) {
        chromeOptions.addArguments("--headless");
        }
        return chromeOptions;
    }

}
