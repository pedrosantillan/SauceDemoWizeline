package pageobjects;

import org.openqa.selenium.By;
import utils.BaseActions;

public class SauceDemoOverviewPage extends BaseActions {

    public By checkoutOverview(){
        return By.xpath("//div[@id='contents_wrapper']/div[@class='subheader']");
    }

    public By finishButton(){
        return By.xpath("//div[@id='checkout_summary_container']/div/div[2]/div[8]/a[2]");
    }
}