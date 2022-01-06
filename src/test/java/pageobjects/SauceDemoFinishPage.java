package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoFinishPage extends BaseActions {

    public By finishLabel(){
        return By.cssSelector(".pony_express");
    }
}

