package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoYourInformationPage extends BaseActions {

    public By firstNameField(){
        return By.cssSelector("#first-name");
    }

    public By LastNameField(){
        return By.cssSelector("#last-name");
    }

    public By continueButton(){
        return By.cssSelector("#continue");
    }

    public By errorMessage(){
        return By.cssSelector("h3[data-test='error']");
    }

    public By zipCodeField(){
        return By.cssSelector("#postal-code");
    }
}
