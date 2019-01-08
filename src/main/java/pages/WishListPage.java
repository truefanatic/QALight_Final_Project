package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends ParentPage {

    @FindBy(xpath = "//*[@id='overflow-menu-popover-trigger']")
    private WebElement workWithListFocus;

    @FindBy(xpath = "//*[@id='editYourList']")
    private WebElement manageListButton;

    @FindBy(xpath = "//*[@id='list-settings-container']/span/span/span/input")
    private WebElement deleteListButton;

    @FindBy(xpath = "//*[@id='list-delete-confirm']/span/input")
    private WebElement confirmDeleteListButton;

    public WishListPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void deleteList() {
        actionsWithOurElements.moveToOurElement(workWithListFocus);
        actionsWithOurElements.clickOnElement(manageListButton);
        actionsWithOurElements.clickOnElement(deleteListButton);
        actionsWithOurElements.clickOnElement(confirmDeleteListButton);
    }
}
