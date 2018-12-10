package login;

import org.junit.Test;
import parentTest.ParentTest;

public class Login extends ParentTest {
    @Test
    public void start() {
        loginPage.openSite();
        loginPage.goToLogin();
        loginPage.login("4mytst@gmail.com", "test4tst");

        //Assert.assertTrue("Test successfully", true);
    }
}
