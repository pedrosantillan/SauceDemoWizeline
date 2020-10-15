package flows;

import pageobjects.SauceDemoLogInPage;

public class ClearFieldsFlow extends SauceDemoLogInPage {

    public void clearFieldsLoginPage(){
        clearFields(userNameField());
        clearFields(passwordField());
    }
}

