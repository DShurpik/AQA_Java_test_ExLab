package BasePage;

import ExlabPages.LandingPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static Driver.SimpleDriver.*;

public abstract class BaseTest {

    protected LandingPage landingPage;

    @BeforeMethod(groups = {"smoke", "regress1"})
    public void setUp() {
        createDriver();
        landingPage = new LandingPage();
    }

    @AfterMethod(groups = {"smoke", "regress1"})
    public void closeDriver() {
        closeWebDriver();
    }

}
