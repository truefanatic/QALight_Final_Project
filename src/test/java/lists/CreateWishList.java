package lists;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class CreateWishList extends ParentTest {
    @Before
    public void setup() {
        mainPage.openAndLogin();
    }


    @Test
    public void start() {
        mainPage.goToWishList();
        wishListPage.creteList();
        wishListPage.createWishList("My list");
        Assert.assertEquals("Creating list failed", "My list", wishListPage.checkListName());
    }

    @After
    public void clear() {
        wishListPage.deleteList();
        mainPage.logOut();
    }

}
