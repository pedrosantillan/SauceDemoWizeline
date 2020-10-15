package flows;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageobjects.SauceDemoOverviewPage;
import pageobjects.SauceDemoYourInformationPage;

public class InformationFlow extends SauceDemoYourInformationPage {

    private final Logger log = LoggerFactory.getLogger(InformationFlow.class);
    private SauceDemoOverviewPage sauceDemoOverviewPage = new SauceDemoOverviewPage();

    public void inputPersonalInformation(String firstName, String lastName){
        input(firstName,firstNameField());
        input(lastName,LastNameField());
        click(continueButton());
    }

    public void validateErrorPostalCode(){
        if (isElementPresent(errorMessage())){
            log.info("Test has passed, the error message was displayed as expected Error:Postal Code is required");
        }else{
            testFail(", the error message was NOT displayed as expected");
        }
    }

    public void inputPersonalInformationComplete(String firstName, String lastName, String zipCode){
        input(firstName,firstNameField());
        input(lastName,LastNameField());
        input(zipCode,zipCodeField());
        click(continueButton());
    }

    public void validateNavigateToCheckoutOverview(){
        if (isElementPresent(sauceDemoOverviewPage.checkoutOverview())){
            log.info("Test has passed, the user navigates to the overview page once the data has been filled");
        }else{
            testFail(", the user did not navigate to the overview page");
        }
    }
}

