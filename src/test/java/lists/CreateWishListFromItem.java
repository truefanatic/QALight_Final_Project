package lists;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class CreateWishListFromItem extends ParentTest {
    @Before
    public void setup() {
        mainPage.openAndLogin();
    }

    @Test
    public void start() {
        mainPage.searchFirstItem("Nineteen Eighty-Four");
        itemPage.createWishList("My list");
        Assert.assertEquals("Creating list failed", "My list", wishListPage.checkListName());
    }

    @After
    public void clear() {
        wishListPage.deleteList();
        mainPage.logOut();
    }

}
