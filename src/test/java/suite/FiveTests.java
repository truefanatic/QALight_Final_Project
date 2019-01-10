package suite;

import cart.Cart;
import lists.CreateWishList;
import lists.CreateWishListFromItem;
import login.Login;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import search.Search;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                Login.class,
                Search.class,
                Cart.class,
                CreateWishList.class,
                CreateWishListFromItem.class
        }
)

public class FiveTests {
}