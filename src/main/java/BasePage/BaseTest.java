package BasePage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static Driver.SimpleDriver.*;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp() {
        createDriver();
    }

    @AfterMethod
    public void closeDriver() {
        closeWebDriver();
    }

}
