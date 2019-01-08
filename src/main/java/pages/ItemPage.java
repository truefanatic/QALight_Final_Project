package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends ParentPage {

    @FindBy(xpath = "//*[@id='productTitle']")
    private WebElement titleOfTheItemHeader;

    @FindBy(xpath = "//*[@id='wishListMainButton']")
    private WebElement wishListButton;

    @FindBy(xpath = "//*[@id='WLNEW_section_wlType']/div[2]/div[2]/div/div/span/div/label/i")
    private WebElement wishListCheckBox;

    @FindBy(xpath = "//*[@id=\"WLNEW_privacy_private\"]/span/input")
    private WebElement privateButton;

    @FindBy(xpath = "//*[@id=\"WLHUC_result\"]/form/div[2]/span[3]/span/span/input")
    private WebElement submitWishListButton;

    @FindBy(id = "WLNEW_list_name")
    private WebElement wishListNameInput;

    @FindBy(xpath = "//*[@id=\"wl-huc-post-create-msg\"]/div/div[2]/span[1]/span/a")
    private WebElement toWishListButton;

    @FindBy(xpath = "//*[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='hlb-view-cart-announce']")
    private WebElement toCartButton;

    public ItemPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void createWishList(String name) {
        actionsWithOurElements.clickOnElement(wishListButton);
        actionsWithOurElements.clickOnElement(wishListCheckBox);
        actionsWithOurElements.clickOnElement(privateButton);
        actionsWithOurElements.enterTextInToElement(wishListNameInput, name);
        actionsWithOurElements.clickOnElement(submitWishListButton);
        actionsWithOurElements.clickOnElement(toWishListButton);
    }

    public void addToCart() {
        actionsWithOurElements.clickOnElement(addToCartButton);
        actionsWithOurElements.clickOnElement(toCartButton);
    }

    public String checkItemHeader() {
        return titleOfTheItemHeader.getText();
    }

}