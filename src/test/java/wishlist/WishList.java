package wishlist;

import org.junit.Test;
import parentTest.ParentTest;

public class WishList extends ParentTest {
    @Test
    public void start() {
        mainPage.openSite();
        mainPage.goToLogin();
        mainPage.login("4mytst@gmail.com", "test4tst");
        mainPage.searchItem("1984 george orwell hardcover");
        mainPage.clickFirstItem();
        itemPage.createWishList("My list");
    }
}
