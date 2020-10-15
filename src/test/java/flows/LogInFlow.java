package flows;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.SauceDemoLogInPage;
import pageobjects.SauceDemoProductsPage;

public class LogInFlow extends SauceDemoLogInPage {

    private final Logger log = LoggerFactory.getLogger(LogInFlow.class);
    private SauceDemoProductsPage sauceDemoProductsPage = new SauceDemoProductsPage();

    public void logIn(String userName, String userPassWord) {
        input(userName, userNameField());
        input(userPassWord, passwordField());
        click(logInButton());

    }

    public void logInConfirmation(){
        if (isElementPresent(sauceDemoProductsPage.theConfirmationLabel())){
            log.info("Test has passed, the user login was successful");
        }else{
            testFail(", the user login was NOT successful");
        }
    }

    public void logInError(){
        if (isElementPresent(theErrorLogInMessage())){
            log.info("Test has passed, the Epic sadface message was displayed as expected, the user was not logged in as expected");
        }else{
            testFail(", the Epic sadface message was NOT displayed as expected");
        }
    }

}
