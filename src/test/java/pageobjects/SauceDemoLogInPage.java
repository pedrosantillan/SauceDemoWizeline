package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoLogInPage extends BaseActions {

    public By userNameField() {
        return By.id("user-name");
    }

    public By passwordField () {
        return By.id("password");
    }

    public By logInButton () {
        return By.id("login-button");
    }

    public By theErrorLogInMessage(){
        return By.xpath("//button[@class='error-button']");
    }

}
