package flows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.SauceDemoFinishPage;
import pageobjects.SauceDemoOverviewPage;
import pageobjects.SauceDemoProductsPage;
import pageobjects.SauceDemoShoppingCartPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCartFlow extends SauceDemoProductsPage {

    private final Logger log = LoggerFactory.getLogger(ShoppingCartFlow.class);
    private SauceDemoShoppingCartPage sauceDemoShoppingCartPage = new SauceDemoShoppingCartPage();
    private SauceDemoProductsPage sauceDemoProductsPage = new SauceDemoProductsPage();
    private SauceDemoOverviewPage sauceDemoOverviewPage = new SauceDemoOverviewPage();
    private SauceDemoFinishPage sauceDemoFinishPage = new SauceDemoFinishPage();

    public void clickShoppingCart() throws InterruptedException {
        click(shoppingCartButton());
        sleepFor(2000);
    }

    public void shoppingCartPageConfirmation() {
        if (isElementPresent(sauceDemoShoppingCartPage.theConfirmationLabel())) {
            log.info("Test has passed, the user went to the shopping cart page successful");
        } else {
            testFail(", the user didn't go to the shopping cart page successful");
        }
    }

    public String addSingleItem() {
        String nameProduct;
        click(addToCartButton());
        nameProduct = getText(sauceDemoProductsPage.inventoryItemNameLabel());
        return nameProduct;
    }

    public void validateItemAdded(String nameProduct) {
        String nameProductShoppingBag;
        nameProductShoppingBag = getText(sauceDemoShoppingCartPage.descriptionLabel());
        if (!nameProduct.equals(nameProductShoppingBag)) {
            testFail("the product added to the shopping cart is not the same as the one in the shopping cart");
        } else {
            log.info("Test has passed, the product added to the shopping cart is the same as the one in the shopping cart");
        }
    }

    public ArrayList<String> addMultiplesItems() {
        ArrayList<String> namesProduct = new ArrayList<String>();
        click(addMultipleItemsToCartButton("1"));
        namesProduct.add(getText(sauceDemoProductsPage.inventoryMultipleItemsNamesLabel("1")));
        click(addMultipleItemsToCartButton("4"));
        namesProduct.add(getText(sauceDemoProductsPage.inventoryMultipleItemsNamesLabel("4")));
        click(addMultipleItemsToCartButton("6"));
        namesProduct.add(getText(sauceDemoProductsPage.inventoryMultipleItemsNamesLabel("6")));
        return namesProduct;
    }

    public void validateItemsAdded(ArrayList<String> products) {
        List<WebElement> listAdded = driver().findElements(By.xpath("//div[@id='cart_contents_container']/div/div/div/div[2]/a/div"));
        ArrayList<String> listOnCart = new ArrayList<String>();
        for (WebElement names : listAdded) {
            listOnCart.add(names.getText());
        }
        if(equalLists(products,listOnCart)){
            log.info("the products were added to the shopping cart correctly");
        }else {testFail("the products were NOT added to the shopping cart correctly");}
    }

    public boolean equalLists(ArrayList<String> a, ArrayList<String> b) {
        Collections.sort(a);
        Collections.sort(b);
        return a.equals(b);
    }

    public void clickOnCheckoutButton(){
        click(sauceDemoShoppingCartPage.checkoutButton());
    }

    public void validateItemsAddedOverview(ArrayList<String> products) {
        List<WebElement> listAdded = driver().findElements(By.xpath("//div[@class='cart_list']/div/div[2]/a/div"));
        ArrayList<String> listOnCart = new ArrayList<String>();
        for (WebElement names : listAdded) {
            listOnCart.add(names.getText());
        }
        if(equalLists(products,listOnCart)){
            log.info("the products in Checkout Overview match with the added items");
        }else {testFail("the products in Checkout Overview NOT match with the added items");}
    }

    public void clickFinishButton(){
        click(sauceDemoOverviewPage.finishButton());
    }

    public void confirmationPageValidation(){
        if (isElementPresent(sauceDemoFinishPage.finishLabel())){
            log.info("Test has passed, the user navigates to the confirmation page");
        }else{
            testFail(", the user did not navigate to the confirmation page");
        }
    }

}
