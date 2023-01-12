package ExlabPages;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

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
    private final By connectBtnInHeader = By.xpath("//div[@class='sc-hAZoDl hrEelO']");
    private final By nameOfTelegramBot = By.xpath("//span[@dir='auto']");
    private final By aboutUsOnPage = By.xpath("//div[@class='sc-eCYdqJ koNCEH' and contains(text(),'О нас')]");
    private final By textUnderAboutUsOnPage = By.xpath("//p[@class='sc-himrzO bgsrpw']");
    private final By whyExlabOnPage = By.xpath("//div[@class='sc-cCsOjp bWNIcl']");
    private final By textUnderWhyExlabOnPage = By.xpath("//ol[@class='sc-bZnhIo fYGDkJ']");
    private final By joinBtnOnPage = By.xpath("//div[@class='sc-jdAMXn gLqyEH']/a[contains(text(),'Присоединиться')]");
    private final By projectOnPage = By.xpath("//div[@data-scroll-target='#projects-title-wrapper']");
    private final By exlabImgOnProject = By.xpath("//img[@alt='ExLab']");
    private final By healthyLifeImgOnProject = By.xpath("//img[@alt='Healthy life ']");
    private final By easyhelpImgOnProject = By.xpath("//img[@alt='Easyhelp ']");
    private final By logosOnProject = By.xpath("//img[@class='sc-jOrMOR eGXkMj']");
    private final By textOnExlabOnProject = By.xpath("//p[@class='sc-dPyBCJ elZmsx' and contains(text(),'Платформа поможет')]");
    private final By textOnHealthyLifeOnProject = By.xpath("//p[@class='sc-dPyBCJ elZmsx' and contains(text(),'Приложение для')]");
    private final By textOnEasyHelpOnProject = By.xpath("//p[@class='sc-dPyBCJ elZmsx' and contains(text(),'Платформа организует')]");
    private final By textsOnProjectBlock = By.xpath("//p[@class='sc-dPyBCJ elZmsx']");
    private final By mentorsTitleOnPage = By.xpath("//div[@class='sc-eCYdqJ koNCEH' and text()='Менторы']");
    private final By mentorsStanislavPlus = By.xpath("(//span[@class='sc-eKBdFk cFcyNJ'])[1]");
    private final By mentorsStanislavInfo = By.xpath("(//ul[@class='sc-dsQDmV iZMcmm'])[1]");
    private final By mentorstUdaevPlus = By.xpath("(//span[@class='sc-eKBdFk cFcyNJ'])[2]");
    private final By mentorsUdaevMinus = By.xpath("//span[@class='sc-eKBdFk gGHWQo']");
    private final By mentorsUdaevFoto = By.xpath("//img[@alt='Александр Юдаев']");
    private final By nameMentors = By.xpath("//p[@class='sc-jOhDuK efeKUw']");
    private final By mentorstSovrasPlus = By.xpath("(//span[@class='sc-eKBdFk cFcyNJ'])[3]");
    private final By becomeMentor = By.xpath("//div[@class='sc-dwLEzm kIwrdA']");


    public LandingPage open() {
        loadPage("http://test.exlab.team/");
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

    public LandingPage connectBtnInHeaderDisplayed() {
        isDisplayed(connectBtnInHeader);
        return this;
    }

    public LandingPage joinBtnOnPageDisplayed() {
        moveTo(joinBtnOnPage);
        isDisplayed(joinBtnOnPage);
        return this;
    }

    public LandingPage cliclOnJoinBtnOnPage() {
        moveTo(joinBtnOnPage);
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(joinBtnOnPage)));
        click(joinBtnOnPage);
        return this;
    }

    public LandingPage connectBtnInHeaderClick() {
        click(connectBtnInHeader);
        return this;
    }

    public LandingPage nameOfTelegramBotIsDisplayed() {
        isDisplayed(nameOfTelegramBot);
        return this;
    }

    public LandingPage aboutUsInHeaderIsDisplayed() {
        isDisplayed(aboutUsHeader);
        return this;
    }

    public LandingPage textUnderAboutUsOnPageIsDisplayed() {
        moveTo(textUnderAboutUsOnPage);
        isDisplayed(textUnderAboutUsOnPage);
        return this;
    }

    public LandingPage textUnderWhyExlabOnPageIsDisplayed() {
        moveTo(textUnderWhyExlabOnPage);
        isDisplayed(textUnderWhyExlabOnPage);
        return this;
    }

    public LandingPage textWhyExlabOnPageIsDisplayed() {
        moveTo(whyExlabOnPage);
        isDisplayed(whyExlabOnPage);
        return this;
    }

    public LandingPage aboutUsOnPageIsDisplayed() {
        isDisplayed(aboutUsOnPage);
        return this;
    }

    public LandingPage projectOnPageIsDisplayed() {
        moveTo(projectOnPage);
        isDisplayed(projectOnPage);
        return this;
    }

    public LandingPage exlabLogoOnProjectIsDisplayed() {
        moveTo(exlabImgOnProject);
        isDisplayed(exlabImgOnProject);
        return this;
    }

    public LandingPage healthyLifeLogoOnProjectIsDisplayed() {
        moveTo(healthyLifeImgOnProject);
        isDisplayed(healthyLifeImgOnProject);
        return this;
    }

    public LandingPage easyhelpOnProjectLogoIsDisplayed() {
        moveTo(easyhelpImgOnProject);
        isDisplayed(easyhelpImgOnProject);
        return this;
    }

    public LandingPage checkImgOnProjectBlockIsDisplayed() {
        moveTo(easyhelpImgOnProject);
        List<WebElement> list = driver.findElements(logosOnProject);
        for (int i = 1; i < list.size(); i++) {
            Assert.assertTrue(list.get(i).isDisplayed());
        }
        return this;
    }

    public LandingPage checkTextsOnProjectBlockIsDisplayed() {
        moveTo(textOnEasyHelpOnProject);
        List<WebElement> list = driver.findElements(textsOnProjectBlock);
        for (int i = 1; i < list.size(); i++) {
            Assert.assertTrue(list.get(i).isDisplayed());
        }
        return this;
    }

    public LandingPage exlabTextOnProjectIsDisplayed() {
        moveTo(textOnExlabOnProject);
        isDisplayed(textOnExlabOnProject);
        return this;
    }

    public LandingPage healthyLifeTextOnProjectIsDisplayed() {
        moveTo(textOnHealthyLifeOnProject);
        isDisplayed(textOnHealthyLifeOnProject);
        return this;
    }

    public LandingPage easyhelpTextOnProjectIsDisplayed() {
        moveTo(textOnEasyHelpOnProject);
        isDisplayed(textOnEasyHelpOnProject);
        return this;
    }

    public LandingPage mentorsHeaderOnPageIsDisplayed() {
        moveTo(mentorsTitleOnPage);
        isDisplayed(mentorsTitleOnPage);
        return this;
    }

    public LandingPage openMentorsInfo() {
        moveTo(mentorsStanislavPlus);
        click(mentorsStanislavPlus);
        return this;
    }

    public LandingPage infoAboutMentorsIsDisplayedAfterOpen() {
        moveTo(mentorstUdaevPlus);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorsStanislavInfo)));
        isDisplayed(mentorsStanislavInfo);
        return this;
    }

    public LandingPage openMentorsInfoUdaev() {
        moveTo(mentorstUdaevPlus);
        click(mentorstUdaevPlus);
        return this;
    }

    public LandingPage photoMentorsUdaevIsDisplayed() {
        moveTo(mentorstSovrasPlus);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorsUdaevFoto)));
        isDisplayed(mentorsUdaevFoto);
        return this;
    }

    public LandingPage countMentorsName() {
        moveTo(mentorstUdaevPlus);
        List<WebElement> list = driver.findElements(nameMentors);
        Assert.assertEquals(list.size(), 4);
        return this;
    }
    public LandingPage closeMentorsInfoUdaev() {
        click(mentorsUdaevMinus);
        return this;
    }

    public LandingPage photoUdaevIsNotDisplayed() {
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(mentorsUdaevFoto)));
        Assert.assertFalse(driver.findElement(mentorsUdaevFoto).isDisplayed());
        return this;
    }

    public LandingPage becameMentorButtonIsDisplayed() {
        moveTo(mentorsNavigate);
        moveTo(becomeMentor);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(becomeMentor)));
        isDisplayed(becomeMentor);
        return this;
    }

    public LandingPage checkTitle(String expectedTitle, String expectedUrl) {
        Assert.assertEquals(getTitle(), expectedTitle);
        Assert.assertEquals(getUrl(), expectedUrl);
        return this;
    }

    private String getTitle() {
        return driver.getTitle();
    }

    private String getUrl() {
        return driver.getCurrentUrl();
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

    public LandingPage navigateTo() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return this;
    }

    public LandingPage moveToAboutUsOnPage() {
        moveTo(aboutUsOnPage);
        return this;
    }



}
