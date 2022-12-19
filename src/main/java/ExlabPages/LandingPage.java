package ExlabPages;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LandingPage extends BasePage {

    private final By sunElement = By.xpath("//div[@class='sc-fnykZs fEkGUM']"); // На темной теме элемент солнце
    private final By moonElement = By.xpath("//div[@class='sc-fnykZs lfkjFc']"); // На белой теме элемент луна
    private final By pageDark = By.xpath("//div[@class='sc-bczRLJ ckyTig']");
    private final By pageWhite = By.xpath("//div[@class='sc-bczRLJ cxdoLY']");
    private final By titleDark = By.xpath("//div[@id='logo_mobile'][1]");
    private final By aboutUsHeader = By.partialLinkText("О нас");
    private final By aboutUsNavigate = By.xpath("//div[@class='sc-eCYdqJ koNCEH' and text()='О нас']");
    private final By projectstHeader = By.partialLinkText("Проекты");
    private final By projectsNavigate = By.xpath("//div[@class='sc-eCYdqJ koNCEH' and text()='Проекты']");
    private final By mentorsHeader = By.partialLinkText("Менторы");
    private final By mentorsNavigate = By.xpath("//div[@class='sc-eCYdqJ koNCEH' and text()='Менторы']");
    private final By startUpForHeader = By.partialLinkText("StartUp для");
    private final By startUpForNavigate = By.xpath("//div[@class='sc-gSAPjG iMnSkO']");

    public LandingPage open(String url) {
        loadPage(url);
        return this;
    }

    public LandingPage sunElementIsDisplayed() {
        isDisplayed(sunElement);
        return this;
    }

    public LandingPage clickOnSunElement() {
        click(sunElement);
        return this;
    }

    public LandingPage moonElementIsDisplayed() {
        isDisplayed(moonElement);
        return this;
    }

    public LandingPage titleDarkIsDisplayed() {
        isDisplayed(titleDark);
        return this;
    }

    public LandingPage aboutUsIsDisplayed() {
        isDisplayed(aboutUsHeader);
        return this;
    }

    public LandingPage checkTitle(String expectedTitle) {
        Assert.assertEquals(getTitle(), expectedTitle);
        return this;
    }

    private String getTitle() {
        return driver.getTitle();
    }

    public LandingPage checkColorDark(String color) {
        Assert.assertEquals(getColorDark(), color);
        return this;
    }

    private String getColorDark() {
        return driver.findElement(pageDark).getCssValue("background-color");
    }

    public LandingPage checkColorWhite(String color) {
        Assert.assertEquals(getColorWhite(), color);
        return this;
    }

    private String getColorWhite() {
        return driver.findElement(pageWhite).getCssValue("background-color");
    }

    public LandingPage clickOnAboutUs() {
        click(aboutUsHeader);
        return this;
    }

    public LandingPage aboutUsNavigateTo() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(aboutUsNavigate)));
        isDisplayed(aboutUsNavigate);
        return this;
    }

    public LandingPage projectHeaderIsDisplayed() {
        isDisplayed(projectstHeader);
        return this;
    }

    public LandingPage clickProjectsHeader() {
        click(projectstHeader);
        return this;
    }

    public LandingPage projectNavigateTo() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(projectsNavigate)));
        isDisplayed(projectsNavigate);
        return this;
    }

    public LandingPage mentorsHeaderIsDisplayed() {
        isDisplayed(mentorsHeader);
        return this;
    }

    public LandingPage clickMentorsHeader() {
        click(mentorsHeader);
        return this;
    }

    public LandingPage mentorsNavigateTo() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorsNavigate)));
        isDisplayed(mentorsNavigate);
        return this;
    }

    public LandingPage startUpForHeaderIsDisplayed() {
        isDisplayed(startUpForHeader);
        return this;
    }

    public LandingPage clickStartUpForHeader() {
        click(startUpForHeader);
        return this;
    }

    public LandingPage startUpForNavigateTo() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(startUpForNavigate)));
        isDisplayed(startUpForNavigate);
        return this;
    }

}
