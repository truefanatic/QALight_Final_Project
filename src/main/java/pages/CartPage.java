package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends ParentPage {
    @FindBy(xpath = "//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input")
    private WebElement deleteFromCartButton;
    @FindBy(xpath = "//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")
    private WebElement itemInCart;

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void deletefromCart() {
        actionsWithOurElements.clickOnElement(deleteFromCartButton);
    }

    public String checkItemInCart() {
        return itemInCart.getText();
    }
}
