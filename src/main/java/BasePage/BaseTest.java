package BasePage;

import ExlabPages.LandingPage;
import ExlabPages.LandingPage_ref;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static Driver.SimpleDriver.*;

public abstract class BaseTest {

    protected LandingPage landingPage;
    protected LandingPage_ref landingPage_ref;

    @BeforeMethod
    public void setUp() {
        createDriver();
        landingPage = new LandingPage();
        landingPage_ref = new LandingPage_ref();
    }

    @AfterMethod
    public void closeDriver() {
        closeWebDriver();
    }
}
