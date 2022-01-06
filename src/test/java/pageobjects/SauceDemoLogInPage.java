package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoLogInPage extends BaseActions {

    public By userNameField() {
        return By.cssSelector("#user-name");
    }

    public By passwordField () {
        return By.cssSelector("#password");
    }

    public By logInButton () {
        return By.cssSelector("#login-button");
    }

    public By theErrorLogInMessage(){
        return By.cssSelector("h3[data-test='error']");
    }

}
