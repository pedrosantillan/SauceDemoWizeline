package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoShoppingCartPage extends BaseActions {

    public By theConfirmationLabel(){
        return By.cssSelector("span[class='title']");
    }

    public By descriptionLabel(){
        return By.cssSelector("#item_4_title_link>div");
    }

    public By checkoutButton(){
        return By.cssSelector("#checkout");
    }

}

