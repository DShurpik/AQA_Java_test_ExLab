package ExlabPages;

import BasePage.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    private final By sunElement = By.xpath("//div[@class='sc-fnykZs fEkGUM']"); // На темной теме элемент солнце

    public LandingPage open(String url) {
        loadPage(url);
        return this;
    }

    public LandingPage sunElementIsDisplayed() {
        System.out.println("Element " + sunElement.toString() + " is displayed");
        isDisplayed(sunElement);
        return this;
    }
}
