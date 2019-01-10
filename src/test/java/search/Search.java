package search;

import org.junit.*;
import parentTest.ParentTest;

public class Search extends ParentTest {
    @Before
    public void setup() {
        mainPage.openAndLogin();
    }

    @Test
    public void start() {
        mainPage.searchFirstItem("Nineteen Eighty-Four");
        Assert.assertEquals("Search Failed", itemPage.checkItemHeader(), "Nineteen Eighty-Four");
    }

    @After
    public void clear() {
        mainPage.logOut();
    }
}
