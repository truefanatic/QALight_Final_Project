package login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class Login extends ParentTest {
    @Test
    public void start() {
        mainPage.openAndLogin();
        Assert.assertEquals("Login Failed", mainPage.checkUserName(), "Hello, Tester");
    }

    @After
    public void clear() {
        mainPage.logOut();
    }
}
