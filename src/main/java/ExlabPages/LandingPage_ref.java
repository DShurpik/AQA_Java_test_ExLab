package ExlabPages;

import BasePage.BasePage;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
@Data
public class LandingPage_ref extends BasePage {

    private static final By sunElement = By.xpath("//div[@class='sc-fnykZs fEkGUM']"); // На темной теме элемент солнце
    private static final By moonElement = By.xpath("//div[@class='sc-fnykZs lfkjFc']"); // На белой теме элемент луна
    private static final By pageDark = By.xpath("//div[@class='sc-bczRLJ ckyTig']");
    private static final By pageWhite = By.xpath("//div[@class='sc-bczRLJ cxdoLY']");
    private static final By exlabLogoDark = By.xpath("//div[@id='logo_mobile'][1]");
    private static final By aboutUsHeader = By.partialLinkText("О нас");
    private static final By projectstHeader = By.partialLinkText("Проекты");
    private static final By mentorsHeader = By.xpath("//a[@class='sc-evZas hJsxZw' and text()='Менторы']");
    private static final By startUpForHeader = By.xpath("//a[@class='sc-evZas hJsxZw' and text()='StartUp для']");
    private static final By startUpOnPage = By.xpath("//div[@class='sc-eCYdqJ koNCEH is-inview' and text()='StartUp для']");
    private static final By startUpOnPage1 = By.xpath("//h2[@class='sc-eKszNL btnxIe']");
    private static final By connectBtnInHeader = By.xpath("//div[@class='sc-hAZoDl hrEelO']");
    private static final By aboutUsOnPage = By.xpath("//div[text()='О нас']");
    private static final By textUnderAboutUsOnPage = By.xpath("//p[@class='sc-himrzO bgsrpw']");
    private static final By whyExlabOnPage = By.xpath("//div[text()='Почему ExLab?']");
    private static final By textUnderWhyExlabOnPage = By.xpath("//ol[@class='sc-bZnhIo fYGDkJ']");
    private static final By joinBtnOnPage = By.xpath("//div[@class='sc-jdAMXn gLqyEH']/a[contains(text(),'Присоединиться')]");
    private static final By projectOnPage = By.xpath("//div[text()='Проекты']");
    private static final By exlabImgOnProject = By.xpath("//img[@alt='ExLab']");
    private static final By healthyLifeImgOnProject = By.xpath("//img[@alt='Healthy life ']");
    private static final By easyhelpImgOnProject = By.xpath("//img[@alt='Easyhelp ']");
    private static final By logosOnProject = By.xpath("//img[@class='sc-jOrMOR eGXkMj']");
    private static final By textOnExlabOnProject = By.xpath("//p[contains(text(),'Платформа поможет')]");
    private static final By textOnHealthyLifeOnProject = By.xpath("//p[contains(text(),'Приложение для')]");
    private static final By textOnEasyHelpOnProject = By.xpath("//p[contains(text(),'Платформа организует')]");
    private static final By textsOnProjectBlock = By.xpath("//p[@class='sc-dPyBCJ elZmsx']");
    private static final By mentorsOnPage = By.xpath("//div[text()='Менторы']");
    private static final By mentorsHarlapPlus = By.xpath("(//span[@class='sc-eKBdFk cFcyNJ'])[1]");
    private static final By mentorsHarlapInfo = By.xpath("//*[@id='mentors']/div[2]/div[1]/div[1]/div[1]/span");
    private static final By mentorstUdaevPlus = By.xpath("(//span[@class='sc-eKBdFk cFcyNJ'])[2]");
    private static final By mentorsUdaevMinus = By.xpath("//span[@class='sc-eKBdFk gGHWQo']");
    private static final By mentorsUdaevFoto = By.xpath("//img[@alt='Александр Юдаев']");
    private static final By nameMentors = By.xpath("//p[@class='sc-jOhDuK efeKUw']");
    private static final By mentorstSovrasPlus = By.xpath("(//span[@class='sc-eKBdFk cFcyNJ'])[3]");
    private static final By becomeMentor = By.xpath("//a[@class='sc-dkzDqf dEddqP' and text()='Стать ментором']");
    private static final By murashkoMentor = By.xpath("//p[text()='Александра Мурашко']");
    private static final By textOnStartUpForJuniors = By.xpath("//div[@class='sc-jfmDQi jtqNlU']");
    private static final By textOnStartUpForHR = By.xpath("//p[@class='sc-gFGZVQ eMPtDU']");
    private static final By searchCandidateOnPageBtn = By.xpath("//div[@class='sc-fbPSWO dEooHG']");
    private static final By helpProjectOnPage = By.xpath("//div[@class='sc-jTYCaT coDMnK']");
    private static final By textOnHelpProject = By.xpath("//div[@class='sc-fctJkW gfwicC']");
    private static final By boostyBTN = By.xpath("//a[@class='sc-dkzDqf dEddqP' and text()='Boosty']");
    private static final By patreonBTN = By.xpath("//a[@class='sc-hKMtZM etdNbW' and text()='Patreon']");
    private static final By titleOnBoosty = By.xpath("//h1[text()='ExLab']");
    private static final By stayInConnectionOnPAge = By.xpath("//div[@class='sc-bhVIhj uaVnA']");
    private static final By textInStayOnConnection = By.xpath("//div[@class='sc-eGAhfa cacMWv']");
    /** FOOTER */
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
    /////////////////////////////////////
    String string = "sat";

    public static By getSunElement() {
        return sunElement;
    }

    public static By getExlabLogoDark() {
        return exlabLogoDark;
    }

    public static By getAboutUsHeader() {
        return aboutUsHeader;
    }

    public static By getProjectstHeader() {
        return projectstHeader;
    }

    public static By getMentorsHeader() {
        return mentorsHeader;
    }

    public static By getStartUpForHeader() {
        return startUpForHeader;
    }

    public static By getconnectBtnInHeader() {
        return connectBtnInHeader;
    }

    public static By getAboutUsOnPage() {
        return aboutUsOnPage;
    }

    public static By getTextUnderAboutUsOnPage() {
        return textUnderAboutUsOnPage;
    }

    public static By getWhyExlabOnPage() {
        return whyExlabOnPage;
    }

    public static By getTextUnderWhyExlabOnPage() {
        return textUnderWhyExlabOnPage;
    }

    public static By getJoinBtnOnPage() {
        return joinBtnOnPage;
    }

    public static By getProjectOnPage() {
        return projectOnPage;
    }

    public static By getExlabImgOnProject() {
        return exlabImgOnProject;
    }

    public static By getHealthyLifeImgOnProject() {
        return healthyLifeImgOnProject;
    }

    public static By getEasyhelpImgOnProject() {
        return easyhelpImgOnProject;
    }

    public static By getTextOnExlabOnProject() {
        return textOnExlabOnProject;
    }

    public static By getTextOnHealthyLifeOnProject() {
        return textOnHealthyLifeOnProject;
    }

    public static By getTextOnEasyHelpOnProject() {
        return textOnEasyHelpOnProject;
    }

    public static By getMentorsOnPage() {
        return mentorsOnPage;
    }

    public static By getBecomeMentor() {
        return becomeMentor;
    }

    public static By getStartUpOnPage1() {
        return startUpOnPage1;
    }

    public static By getTextOnStartUpForJuniors() {
        return textOnStartUpForJuniors;
    }

    public static By getTextOnStartUpForHR() {
        return textOnStartUpForHR;
    }

    public static By getSearchCandidateOnPageBtn() {
        return searchCandidateOnPageBtn;
    }

    public static By getHelpProjectOnPage() {
        return helpProjectOnPage;
    }

    public static By getTextOnHelpProject() {
        return textOnHelpProject;
    }

    public static By getBoostyBTN() {
        return boostyBTN;
    }

    public static By getPatreonBTN() {
        return patreonBTN;
    }

    public static By getStayInConnectionOnPAge(){
        return stayInConnectionOnPAge;
    }

    public static By getTextInStayOnConnection() {
        return textInStayOnConnection;
    }
    /////////////////////////////////////

    public LandingPage_ref open() {
        loadPage("http://test.exlab.team/");
        return this;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public Boolean elementIsDisplayed(By locator) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator))).isDisplayed();
        System.out.println(locator.toString() + " is displayed!!!");
        return driver.findElement(locator).isDisplayed();
    }

    public void movingTo(By locator) {
        moveTo(locator);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
    }

    public LandingPage_ref scrollAllPage() {
        try {
            scrollAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public LandingPage_ref scrollHalfPastPage() {
        try {
            scrollHalfPast();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public LandingPage_ref navigateTo() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return this;
    }
}
