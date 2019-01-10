package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CartPage;
import pages.ItemPage;
import pages.MainPage;
import pages.WishListPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    private WebDriver webDriver;
    protected MainPage mainPage;
    protected ItemPage itemPage;
    protected WishListPage wishListPage;
    protected CartPage cartPage;

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage = new MainPage(webDriver);
        itemPage = new ItemPage(webDriver);
        wishListPage = new WishListPage(webDriver);
        cartPage = new CartPage(webDriver);
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}