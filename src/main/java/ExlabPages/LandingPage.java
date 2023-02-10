package ExlabPages;

import BasePage.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;

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
    private final By textOnStartUpForJuniors = By.xpath("//div[@class='sc-jfmDQi jtqNlU']");
    private final By textOnStartUpForHR = By.xpath("//p[@class='sc-gFGZVQ eMPtDU']");
    private final By searchCandidateOnPageBtn = By.xpath("//div[@class='sc-fbPSWO dEooHG']");
    private final By helpProjectOnPage = By.xpath("//div[@class='sc-jTYCaT coDMnK']");
    private final By textOnHelpProject = By.xpath("//div[@class='sc-fctJkW gfwicC']");
    private final By boostyBTN = By.xpath("//a[@class='sc-dkzDqf dEddqP' and text()='Boosty']");
    private final By patreonBTN = By.xpath("//a[@class='sc-hKMtZM etdNbW' and text()='Patreon']");
    private final By titleOnBoosty = By.xpath("//h1[text()='ExLab']");
    private final By stayInConnectionOnPAge = By.xpath("//div[@class='sc-bhVIhj uaVnA']");
    private final By textInStayOnConnection = By.xpath("//div[@class='sc-eGAhfa cacMWv']");


    /**
     * FOOTER
     */
    private static final By logoOnFooter = By.xpath("//div[@class='sc-fIavCj fEzmxG']");
    private static final By textUnderLogoFooter = By.xpath("//div[@class='sc-gITdmR hYaavu']");
    private static final By linkedInOnFooter = By.xpath("//a[text()='lnkdn']");
    private static final By instagramOnFooter = By.xpath("//a[text()='instgrm']");
    private static final By telegramOnFooter = By.xpath("//a[text()='tlgrm']");
    private static final By youtubeOnFooter = By.xpath("//a[text()='ytb']");
    private static final By infoOnFooter = By.xpath("//a[text()='info@exlab.team']");

    /** Locators for test 44, 46, 48, 50 */
    private static final By linkedIn = By.xpath("//h1[text()='Присоединитесь к LinkedIn']");
    private static final By instagram = By.xpath("//h2");
    private static final By telegram = By.xpath("//span[text()='ExLab Channel']");
    private static final By youtube = By.xpath("//div[*='ExLab']");

    /** Геттеры для статичных локаторов необходимы для заполнения дата провайдера в LandingPageDataProvider.class*/

    public static By getLogoOnFooter() {
        return logoOnFooter;
    }

    public static By getTextUnderLogoFooter() {
        return textUnderLogoFooter;
    }

    public static By getLinkedInOnFooter() {
        return linkedInOnFooter;
    }

    public static By getInstagramOnFooter() {
        return instagramOnFooter;
    }

    public static By getTelegramOnFooter() {
        return telegramOnFooter;
    }

    public static By getYoutubeOnFooter() {
        return youtubeOnFooter;
    }

    public static By getInfoOnFooter() {
        return infoOnFooter;
    }

    /** getters for 44, 46, 48, 50 tests */

    public static By getLinkedIn() {
        return linkedIn;
    }
    public static By getInstagram() {
        return instagram;
    }
    public static By getTelegram() {
        return telegram;
    }
    public static By getYoutube() {
        return youtube;
    }

    public boolean isDisplayed_(By locator2) {
        return driver.findElement(locator2).isDisplayed();
    }

    public Boolean elementIsDisplayed(By locator) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator))).isDisplayed();
        System.out.println(locator.toString() + " is displayed!!!");
        return driver.findElement(locator).isDisplayed();
    }


    public LandingPage open() {
        loadPage("http://test.exlab.team/");
        return this;
    }

    public LandingPage scrollAllPage() {
        try {
            scrollAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public LandingPage scrollHalfPastPage() {
        try {
            scrollHalfPast();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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

    public Boolean titleOnBoostyIsDisplayed() {
        return driver.findElement(titleOnBoosty).isDisplayed();
    }

    public Boolean patreonBtnIsDisplayed() {
        return driver.findElement(patreonBTN).isDisplayed();
    }

    public Boolean stayOnConnectionIsDisplayed() {
        return driver.findElement(stayInConnectionOnPAge).isDisplayed();
    }

    public Boolean stayOnConnectionTextOnBlockIsDisplayed() {
        return driver.findElement(textInStayOnConnection).isDisplayed();
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

    public Boolean textStartUpForIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textOnStartUpForJuniors)));
        return driver.findElement(textOnStartUpForJuniors).isDisplayed();
    }

    public Boolean textStartUpForHRIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textOnStartUpForHR)));
        return driver.findElement(textOnStartUpForHR).isDisplayed();
    }

    public Boolean searchCandidateBtnIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchCandidateOnPageBtn)));
        return driver.findElement(searchCandidateOnPageBtn).isDisplayed();
    }

    public Boolean helpProjectOnPageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(helpProjectOnPage)));
        return driver.findElement(helpProjectOnPage).isDisplayed();
    }

    public Boolean textOnHelpProjectOnPageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textOnHelpProject)));
        return driver.findElement(textOnHelpProject).isDisplayed();
    }

    public Boolean boostyBtnIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(boostyBTN)));
        return driver.findElement(boostyBTN).isDisplayed();
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

    public LandingPage moveToStartUpForOnPage() {
        moveTo(startUpOnPage1);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(startUpOnPage1)));
        return this;
    }

    public LandingPage moveToStartUpForTextJuniors() {
        moveTo(textOnStartUpForJuniors);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textOnStartUpForJuniors)));
        return this;
    }

    public LandingPage moveToStartUpForTextHR() {
        moveTo(textOnStartUpForHR);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textOnStartUpForHR)));
        return this;
    }

    public LandingPage moveToSearchCandidate() {
        moveTo(searchCandidateOnPageBtn);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchCandidateOnPageBtn)));
        return this;
    }

    public LandingPage moveToHelpProjectOnPage() {
        moveTo(helpProjectOnPage);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(helpProjectOnPage)));
        return this;
    }

    public LandingPage moveToTextOnHelpProjectOnPage() {
        moveTo(textOnHelpProject);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textOnHelpProject)));
        return this;
    }

    public LandingPage moveToBoostyBtn() {
        moveTo(boostyBTN);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(boostyBTN)));
        return this;
    }

    public LandingPage moveToPatreonBtn() {
        moveTo(patreonBTN);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(patreonBTN)));
        return this;
    }

    public LandingPage moveToStayInConnection() {
        moveTo(stayInConnectionOnPAge);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(stayInConnectionOnPAge)));
        return this;
    }

    public LandingPage moveToStayInConnectionBlockText() {
        moveTo(textInStayOnConnection);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textInStayOnConnection)));
        return this;
    }

    public LandingPage clickOnBoostyBtn() {
        click(boostyBTN);
        return this;
    }

    public void click_(By locator) {
        click(locator);
    }

    @DataProvider(name = "Locators_for_test1")
    public static Object[][] getData() {
        return new Object[][]{
                {logoOnFooter},
                {textUnderLogoFooter},
                {linkedInOnFooter},
                {instagramOnFooter},
                {telegramOnFooter},
                {youtubeOnFooter},
                {infoOnFooter}
        };


    }
}
