package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoOverviewPage extends BaseActions {

    public By checkoutOverview(){
        return By.cssSelector(".title");
    }

    public By finishButton(){
        return By.cssSelector("#finish");
    }
}