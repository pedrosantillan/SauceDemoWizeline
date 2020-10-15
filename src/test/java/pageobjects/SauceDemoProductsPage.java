package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoProductsPage  extends BaseActions {

    public By theConfirmationLabel(){
        return By.xpath("//div[@class='product_label']");
    }

    public By menuProducts() {
        return By.xpath("//div[@id='menu_button_container']/div/div[3]/div/button");
    }

    public By logOutButton() {
        return By.xpath("//a[@id='logout_sidebar_link']");
    }

    public By shoppingCartButton() {
        return By.xpath("//div[@id='shopping_cart_container']/a");
    }

    public By addToCartButton(){
        return By.xpath("//div[@id='inventory_container']/div/div[1]/div[3]/button");}

    public By addMultipleItemsToCartButton(String productNumber){
        return By.xpath("//div[@id='inventory_container']/div/div["+productNumber+"]/div[3]/button");}

    public By  inventoryItemNameLabel(){
        return By.xpath("//div[@id='inventory_container']/div/div[1]/div[2]/a/div");
    }

    public By  inventoryMultipleItemsNamesLabel(String productNumberLabel){
        return By.xpath("//div[@id='inventory_container']/div/div["+productNumberLabel+"]/div[2]/a/div");
    }
}

