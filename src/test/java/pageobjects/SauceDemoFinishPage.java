package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoFinishPage extends BaseActions {

    public By finishLabel(){
        return By.xpath("//div[@id='contents_wrapper']/div[2]");
    }
}

