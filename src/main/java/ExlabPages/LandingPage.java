package ExlabPages;

import BasePage.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.*;

public class LandingPage extends BasePage {

    private final By sunElement = By.xpath("//div[@class='sc-fnykZs fEkGUM']"); // На темной теме элемент солнце
    private final By moonElement = By.xpath("//div[@class='sc-fnykZs lfkjFc']"); // На белой теме элемент луна
    private final By pageDark = By.xpath("//div[@class='sc-bczRLJ ckyTig']");
    private final By pageWhite = By.xpath("//div[@class='sc-bczRLJ cxdoLY']");
    private final By exlabLogoDark = By.xpath("//div[@id='logo_mobile'][1]");
    private final By aboutUsHeader = By.partialLinkText("О нас");
    private final By projectstHeader = By.partialLinkText("Проекты");
    private final By mentorsHeader = By.xpath("//a[@class='sc-evZas hJsxZw' and text()='Менторы']");
    private final By startUpForHeader = By.xpath("//a[@class='sc-evZas hJsxZw' and text()='StartUp для']");
    private final By startUpOnPage = By.xpath("//div[@class='sc-eCYdqJ koNCEH is-inview' and text()='StartUp для']");
    private final By startUpOnPage1 = By.xpath("//h2[@class='sc-eKszNL btnxIe']");
    private final By connectBtnInHeader = By.xpath("//div[@class='sc-hAZoDl hrEelO']");
    private final By aboutUsOnPage = By.xpath("//div[text()='О нас']");
    private final By textUnderAboutUsOnPage = By.xpath("//p[@class='sc-himrzO bgsrpw']");
    private final By whyExlabOnPage = By.xpath("//div[text()='Почему ExLab?']");
    private final By textUnderWhyExlabOnPage = By.xpath("//ol[@class='sc-bZnhIo fYGDkJ']");
    private final By joinBtnOnPage = By.xpath("//div[@class='sc-jdAMXn gLqyEH']/a[contains(text(),'Присоединиться')]");
    private final By projectOnPage = By.xpath("//div[text()='Проекты']");
    private final By exlabImgOnProject = By.xpath("//img[@alt='ExLab']");
    private final By healthyLifeImgOnProject = By.xpath("//img[@alt='Healthy life ']");
    private final By easyhelpImgOnProject = By.xpath("//img[@alt='Easyhelp ']");
    private final By logosOnProject = By.xpath("//img[@class='sc-jOrMOR eGXkMj']");
    private final By textOnExlabOnProject = By.xpath("//p[contains(text(),'Платформа поможет')]");
    private final By textOnHealthyLifeOnProject = By.xpath("//p[contains(text(),'Приложение для')]");
    private final By textOnEasyHelpOnProject = By.xpath("//p[contains(text(),'Платформа организует')]");
    private final By textsOnProjectBlock = By.xpath("//p[@class='sc-dPyBCJ elZmsx']");
    private final By mentorsOnPage = By.xpath("//div[text()='Менторы']");
    private final By mentorsHarlapPlus = By.xpath("(//span[@class='sc-eKBdFk cFcyNJ'])[1]");
    private final By mentorsHarlapInfo = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[1]/div[1]/span");
    private final By mentorstUdaevPlus = By.xpath("(//span[@class='sc-eKBdFk cFcyNJ'])[2]");
    private final By mentorsUdaevMinus = By.xpath("//span[@class='sc-eKBdFk gGHWQo']");
    private final By mentorsUdaevFoto = By.xpath("//img[@alt='Александр Юдаев']");
    private final By nameMentors = By.xpath("//p[@class='sc-jOhDuK efeKUw']");
    private final By mentorstSovrasPlus = By.xpath("(//span[@class='sc-eKBdFk cFcyNJ'])[3]");
    private final By becomeMentor = By.xpath("//a[@class='sc-dkzDqf dEddqP' and text()='Стать ментором']");
    private final By murashkoMentor = By.xpath("//p[text()='Александра Мурашко']");


    public LandingPage open() {
        loadPage("http://test.exlab.team/");
        return this;
    }

    public Boolean sunElementIsDisplayed() {
        return driver.findElement(sunElement).isDisplayed();
    }

    public LandingPage clickOnSunElement() {
        click(sunElement);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(moonElement)));
        return this;
    }

    public Boolean moonElementIsDisplayed() {
        return driver.findElement(moonElement).isDisplayed();
    }

    public Boolean exlabLogoIsDisplayed() {
        return driver.findElement(exlabLogoDark).isDisplayed();
    }

    public Boolean connectBtnInHeaderDisplayed() {
        return driver.findElement(connectBtnInHeader).isDisplayed();
    }

    public LandingPage moveToJoinBtnOnPage() {
        moveTo(joinBtnOnPage);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(joinBtnOnPage)));
        return this;
    }

    public Boolean joinBtnOnPageDisplayed() {
        return driver.findElement(joinBtnOnPage).isDisplayed();
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

    public String telegramUrlIsExpected() {
        return driver.getCurrentUrl();
    }

    public Boolean aboutUsInHeaderIsDisplayed() {
        return driver.findElement(aboutUsHeader).isDisplayed();
    }

    public Boolean aboutUsInHeaderIsClicable() {
        return driver.findElement(aboutUsHeader).isEnabled();
    }

    public Boolean aboutUsInHeaderOnPageIsDisplayed() {
        return driver.findElement(aboutUsOnPage).isDisplayed();
    }

    public Boolean textUnderAboutUsOnPageIsDisplayed() {
        return driver.findElement(textUnderAboutUsOnPage).isDisplayed();
    }

    public Boolean textUnderWhyExlabOnPageIsDisplayed() {
        return driver.findElement(textUnderWhyExlabOnPage).isDisplayed();
    }

    public LandingPage moveTotextUnderWhyExlabOnPage() {
        moveTo(textUnderWhyExlabOnPage);
        return this;
    }

    public LandingPage moveToWhyExlabOnPage() {
        moveTo(whyExlabOnPage);
        return this;
    }

    public Boolean subheaderWhyExlabOnPageIsDisplayed() {
        return driver.findElement(whyExlabOnPage).isDisplayed();
    }

    public LandingPage moveToprojectOnPage() {
        moveTo(projectOnPage);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(projectOnPage)));
        return this;
    }

    public Boolean projectOnPageIsDisplayed() {
        return driver.findElement(projectOnPage).isDisplayed();
    }

    public LandingPage moveToExlabLogoOnProjectModule() {
        moveTo(exlabImgOnProject);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(exlabImgOnProject)));
        return this;
    }

    public boolean exlabLogoOnProjectModuleIsDisplayed() {
        return driver.findElement(exlabImgOnProject).isDisplayed();
    }

    public LandingPage moveTohealthyLifeLogoOnProjectModule() {
        moveTo(healthyLifeImgOnProject);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(healthyLifeImgOnProject)));
        return this;
    }

    public boolean healthyLifeLogoOnProjectModuleIsDisplayed() {
        return driver.findElement(healthyLifeImgOnProject).isDisplayed();
    }

    public LandingPage moveToEasyhelpLogoOnProjectModule() {
        moveTo(easyhelpImgOnProject);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(easyhelpImgOnProject)));
        return this;
    }

    public boolean easyhelpLogoOnProjectModuleIsDisplayed() {
        return driver.findElement(easyhelpImgOnProject).isDisplayed();
    }

    public boolean exlabTextOnProjectIsDisplayed() {
        return driver.findElement(textOnExlabOnProject).isDisplayed();
    }

    public LandingPage moveToExlabTextOnProject() {
        moveTo(textOnExlabOnProject);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textOnExlabOnProject)));
        return this;
    }

    public LandingPage moveToHealthyLifeTextOnProject() {
        moveTo(textOnHealthyLifeOnProject);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textOnHealthyLifeOnProject)));
        return this;
    }

    public boolean healthyLifeTextOnProjectIsDisplayed() {
        return driver.findElement(textOnHealthyLifeOnProject).isDisplayed();
    }

    public LandingPage moveToEasyhelpTextOnProject() {
        moveTo(textOnEasyHelpOnProject);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textOnEasyHelpOnProject)));
        return this;
    }

    public boolean easyhelpTextOnProjectIsDisplayed() {
        return driver.findElement(textOnEasyHelpOnProject).isDisplayed();
    }

    public LandingPage moveToMentorsHeaderOnPage() {
        moveTo(mentorsOnPage);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorsOnPage)));
        return this;
    }

    public boolean mentorsHeaderOnPageIsDisplayed() {
        return driver.findElement(mentorsOnPage).isDisplayed();
    }

    public LandingPage moveToMentorsHarlapInfo() {
        moveTo(mentorsHarlapPlus);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorsHarlapPlus)));
        return this;
    }

    public LandingPage openMentorsHarlapInfo() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorsHarlapInfo)));
        click(mentorsHarlapPlus);
        return this;
    }

    public LandingPage moveToMentorsHarlapInfo1() {
        moveTo(mentorsHarlapInfo);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorsHarlapInfo)));
        return this;
    }

    public boolean infoAboutMentorsHarlapIsDisplayedAfterOpen() {
        return driver.findElement(mentorsHarlapInfo).isDisplayed();
    }

    public LandingPage openMentorsInfoUdaev() {
        moveTo(mentorstUdaevPlus);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorstUdaevPlus)));
        click(mentorstUdaevPlus);
        return this;
    }

    public boolean photoMentorsUdaevIsDisplayed() {
        return driver.findElement(mentorsUdaevFoto).isDisplayed();
    }

    public int countMentorsName() {
        moveTo(mentorstUdaevPlus);
        List<WebElement> list = driver.findElements(nameMentors);
        return list.size();
    }
    public LandingPage closeMentorsInfoUdaev() {
        click(mentorsUdaevMinus);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(mentorsUdaevFoto)));
        return this;
    }

    public boolean photoUdaevIsNotDisplayed() {
        return driver.findElement(mentorsUdaevFoto).isDisplayed();
    }

    public LandingPage moveToBecameMentorButton() {
        moveTo(murashkoMentor);
        moveTo(becomeMentor);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(becomeMentor)));
        return this;
    }

    public boolean becomeMentorIsDisplayed() {
        return driver.findElement(becomeMentor).isDisplayed();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public Boolean sunElementIsDisplayedBoolean() {
        return driver.findElement(sunElement).isDisplayed();
    }

    public String sunElementGetClassName() {
        return driver.findElement(sunElement).getAttribute("class");
    }

    public String moonElementGetClassName() {
        return driver.findElement(moonElement).getAttribute("class");
    }

    public String getColor() {
        return driver.findElement(pageDark).getCssValue("background-color");
    }

    public String getColorPageWhite() {
        return driver.findElement(pageWhite).getCssValue("background-color");
    }

    public LandingPage clickOnAboutUs() {
        click(aboutUsHeader);
        return this;
    }

    public Boolean aboutUsOnPageIsDisplayed() {
        return driver.findElement(aboutUsOnPage).isDisplayed();
    }

    public Boolean projectHeaderIsDisplayed() {
        return driver.findElement(projectstHeader).isDisplayed();
    }

    public Boolean projectHeaderIsClicable() {
        return driver.findElement(projectstHeader).isEnabled();
    }

    public LandingPage clickProjectsHeader() {
        click(projectstHeader);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(projectOnPage)));
        return this;
    }

    public Boolean projectHeaderOnPageIsDisplayed() {
        return driver.findElement(projectOnPage).isDisplayed();
    }

    public Boolean mentorsHeaderIsDisplayed() {
        return driver.findElement(mentorsHeader).isDisplayed();
    }

    public Boolean mentorsHeaderIsClickable() {
        return driver.findElement(mentorsHeader).isEnabled();
    }

    public LandingPage clickMentorsHeader() {
        click(mentorsHeader);
        return this;
    }

    public Boolean mentorsOnPageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(mentorsOnPage)));
        return driver.findElement(mentorsOnPage).isDisplayed();
    }

    public Boolean startUpForHeaderIsDisplayed() {
        return driver.findElement(startUpForHeader).isDisplayed();
    }

    public Boolean startUpForHeaderIsClickable() {
        return driver.findElement(startUpForHeader).isEnabled();
    }

    public LandingPage clickStartUpForHeader() {
        click(startUpForHeader);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(startUpOnPage1)));
        return this;
    }

    public Boolean startUpForOnPageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(startUpOnPage1)));
        return driver.findElement(startUpOnPage1).isDisplayed();
    }

    public LandingPage navigateTo() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return this;
    }

    public LandingPage moveToAboutUsOnPage() {
        moveTo(aboutUsOnPage);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(aboutUsOnPage)));
        return this;
    }

    public LandingPage moveToAboutUsText() {
        moveTo(textUnderAboutUsOnPage);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textUnderAboutUsOnPage)));
        return this;
    }



}
