import BasePage.BaseTest;
import ExlabPages.LandingPage;
import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;



public class LandingPageDataProvider1 extends BaseTest {

    /**
     * Тут используется дата провайдер который импортируется из LandingPage.class строки кода с 574*/

    @Test(dataProvider = "Locators_for_test1", dataProviderClass = LandingPage.class)
    public void test41_50(By locator) {
        landingPage.open()
                .scrollHalfPastPage();
        Assert.assertTrue(landingPage.elementIsDisplayed(locator));
    }

}

