package BasePage;

import ExlabPages.LandingPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static Driver.SimpleDriver.*;

public abstract class BaseTest {

    protected LandingPage landingPage;

    @BeforeMethod
    public void setUp() {
        createDriver();
        landingPage = new LandingPage();
    }

    @AfterMethod
    public void closeDriver() {
        closeWebDriver();
    }
}
