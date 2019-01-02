package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends ParentPage {
    @FindBy(id = "nav-link-accountList")
    private WebElement getSignInButton;
    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    private WebElement toSignInButton;
    @FindBy(id = "ap_email")
    private WebElement loginInput;
    @FindBy(id = "ap_password")
    private WebElement passwordInput;
    @FindBy(id = "signInSubmit")
    private WebElement signInButton;
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInput;
    @FindBy(xpath = "//*[@id='nav-search']/form/div[2]/div/input")
    private WebElement submitSearch;

    @FindBy(xpath = "//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/a/h2")
    private WebElement firstSearchResult;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openSite() {
        try {
            webDriver.get("https://www.amazon.com");
            logger.info("Site has been opened");
        } catch (Exception e) {
            logger.error("Can't open site");
            Assert.fail("Can't open login page");
        }
    }

    public void searchItem(String text) {
        actionsWithOurElements.enterTextInToElement(searchInput, text);
        actionsWithOurElements.clickOnElement(submitSearch);
    }

    public void clickFirstItem() {
        actionsWithOurElements.clickOnElement(firstSearchResult);
    }

    public void goToLogin() {
        actionsWithOurElements.moveToOurElement(getSignInButton);
        actionsWithOurElements.clickOnElement(toSignInButton);
    }

    public void login(String login, String password) {
        actionsWithOurElements.enterTextInToElement(loginInput, login);
        actionsWithOurElements.enterTextInToElement(passwordInput, password);
        actionsWithOurElements.clickOnElement(signInButton);
        logger.info("login successfully");
    }
}
