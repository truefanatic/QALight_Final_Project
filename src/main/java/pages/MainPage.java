package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends ParentPage {
    @FindBy(id = "cookieAnchor")
    private WebElement cookieButton;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openSite() {
        try {
            webDriver.get("http://orteil.dashnet.org/cookieclicker/");
            logger.info("Site has been opened");
        } catch (Exception e) {
            logger.error("Can't open site");
            Assert.fail("Can't open Login page");
        }
    }

    public void clickCookie(int clicks) {
        try {
            for (int i = 0; i < clicks; i++) {
                cookieButton.click();
            }
        } catch (Exception e) {
            logger.error("Can't click button");
            Assert.fail("Can't click button");
        }
    }
}
