package cart;

import org.junit.After;
import org.junit.Test;
import parentTest.ParentTest;

public class Cart extends ParentTest {
    @Test
    public void start() {
        mainPage.openSite();
        mainPage.goToLogin();
        mainPage.login("4mytst@gmail.com", "test4tst");
        mainPage.searchItem("1984 george orwell hardcover");
        mainPage.clickFirstItem();
        itemPage.addToCart();
    }

    @After
    public void clear() {
        cartPage.deletefromCart();
    }
}
