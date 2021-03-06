package cart;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class Cart extends ParentTest {
    @Before
    public void setup() {
        mainPage.openAndLogin();
    }

    @Test
    public void start() {
        mainPage.searchFirstItem("Nineteen Eighty-Four");
        itemPage.addToCart();
        Assert.assertEquals("Adding to Cart Failed", cartPage.checkItemInCart(), "Nineteen Eighty-Four");
    }

    @After
    public void clear() {
        cartPage.deletefromCart();
        mainPage.logOut();
    }
}
