package first;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class first extends ParentTest {
    @Test
    public void start() {
        mainPage.openSite();
        mainPage.clickCookie(3000);
        //Assert.assertTrue("Test successfully", true);
    }
}
