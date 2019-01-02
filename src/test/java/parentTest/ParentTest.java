package parentTest;

import com.gargoylesoftware.htmlunit.Page;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ItemPage;
import pages.MainPage;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    private WebDriver webDriver;
    protected MainPage mainPage;
    protected ItemPage itemPage;

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage = new MainPage(webDriver);
        itemPage = new ItemPage(webDriver);
    }

//    @After
//    public void tearDown() {
//        webDriver.quit();
//    }

    public void checkExpectedResult(String message, boolean actualResult, boolean expectedResult) {
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    public void checkExpectedResult(String message, boolean actualResult) {
        checkExpectedResult(message, actualResult, true);
    }
}