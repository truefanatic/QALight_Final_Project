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

    @FindBy(xpath = "//*[@id='list-delete-cancel']")
    private WebElement confirmDeleteListButton2;

    @FindBy(xpath = "//*[@id='list-delete-confirm-announce']")
    private WebElement confirmDeleteListButton3;

    public WishListPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void deleteList() {
        actionsWithOurElements.moveToOurElement(workWithListFocus);
        actionsWithOurElements.clickOnElement(manageListButton);
        actionsWithOurElements.clickOnElement(deleteListButton);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        actionsWithOurElements.clickOnElement(confirmDeleteListButton);
    }
}
