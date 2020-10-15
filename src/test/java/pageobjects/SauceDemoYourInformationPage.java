package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoYourInformationPage extends BaseActions {

    public By firstNameField(){
        return By.id("first-name");
    }

    public By LastNameField(){
        return By.id("last-name");
    }

    public By continueButton(){
        return By.xpath("//div[@id='checkout_info_container']/div/form/div[2]/input");
    }

    public By errorMessage(){
        return By.xpath("//div[@id='checkout_info_container']/div/form/h3/button");
    }

    public By zipCodeField(){
        return By.id("postal-code");
    }
}
