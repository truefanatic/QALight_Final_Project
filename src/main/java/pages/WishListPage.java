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

    @FindBy(xpath = "//*[@id='profile-list-name']")
    private WebElement listName;

    @FindBy(xpath = "//*[@id='createList']")
    private WebElement createListbutton;

    @FindBy(xpath = "//*[@id='WLNEW_section_wlType']/div[2]/div[2]/div/div/span/div/label/i")
    private WebElement wishListCheckBox;

    @FindBy(xpath = "//*[@id='WLNEW_privacy_private']/span/input")
    private WebElement privateButton;

    @FindBy(xpath = "//*[@id='WLNEW_create']/span/span/input")
    private WebElement submitWishListButton;

    @FindBy(id = "WLNEW_list_name")
    private WebElement wishListNameInput;


    public WishListPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void deleteList() {
        actionsWithOurElements.moveToOurElement(workWithListFocus);
        actionsWithOurElements.clickOnElement(manageListButton);
        waitSec(1000);
        actionsWithOurElements.clickOnElement(deleteListButton);
        waitSec(2000);
        actionsWithOurElements.clickOnElement(confirmDeleteListButton);
    }

    public String checkListName() {
        return listName.getText();
    }

    public void creteList() {
        actionsWithOurElements.clickOnElement(createListbutton);
    }

    public void createWishList(String name) {
        actionsWithOurElements.clickOnElement(wishListCheckBox);
        actionsWithOurElements.clickOnElement(privateButton);
        actionsWithOurElements.enterTextInToElement(wishListNameInput, name);
        actionsWithOurElements.clickOnElement(submitWishListButton);
        waitSec(2000);
    }
}
