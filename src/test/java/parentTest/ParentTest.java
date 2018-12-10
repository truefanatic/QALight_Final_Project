package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    private WebDriver webDriver;
    protected LoginPage loginPage;

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
    }

//    @After
//    public void tearDown() {
//        webDriver.quit();
//    }

//    private void checkExpectedResult(String message, boolean actualResult, boolean expectedResult) {
//        Assert.assertEquals(message, expectedResult, actualResult);
//    }
//
//    private void checkExpectedResult(String message, boolean actualResult) {
//        checkExpectedResult(message, actualResult, true);
//    }
}