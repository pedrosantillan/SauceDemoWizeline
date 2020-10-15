package flows;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.SauceDemoProductsPage;

public class LogOutFlow extends SauceDemoProductsPage {

    private final Logger log = LoggerFactory.getLogger(LogOutFlow.class);
    private LogInFlow logInFlow = new LogInFlow();

    public void logOut() {
        clickElement(menuProducts());
        click(logOutButton());
    }

    public void logOutValidation(){
        if(isElementPresent(logInFlow.logInButton())){
            log.info("Test has passed, the user logout was successful");
        }else{
            testFail(", the user logout was NOT successful");
        }
    }
}

