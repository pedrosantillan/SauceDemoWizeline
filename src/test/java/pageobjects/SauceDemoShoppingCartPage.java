package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoShoppingCartPage extends BaseActions {

    public By theConfirmationLabel(){
        return By.className("subheader");
    }

    public By descriptionLabel(){
        return By.xpath("//div[@id='cart_contents_container']/div/div[1]/div/div[2]/a/div");
    }

    public By checkoutButton(){
        return By.xpath("//div[@id='cart_contents_container']/div/div[2]/a[2]");
    }

}

