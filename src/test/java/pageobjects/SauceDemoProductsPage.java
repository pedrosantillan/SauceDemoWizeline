package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoProductsPage  extends BaseActions {

    public By theConfirmationLabel(){
        return By.cssSelector(".title");
    }

    public By menuProducts() {
        return By.cssSelector("button[id='react-burger-menu-btn']");
    }

    public By logOutButton() {
        return By.cssSelector("a[id='logout_sidebar_link']");
    }

    public By shoppingCartButton() {
        return By.cssSelector("a[class='shopping_cart_link']");
    }

    public By addToCartButton(){
        return By.cssSelector("#add-to-cart-sauce-labs-backpack");}

    public By addMultipleItemsToCartButton(String productName){
        return By.cssSelector("#"+productName);}

    public By  inventoryItemNameLabel(){
        return By.cssSelector("#item_4_title_link>div");
    }

    public By  inventoryMultipleItemsNamesLabel(String productNameLabel){
        return By.cssSelector("#"+productNameLabel);
    }
}

