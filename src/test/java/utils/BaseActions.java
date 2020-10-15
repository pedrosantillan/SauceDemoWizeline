package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseActions extends BaseClass{
    private int time= 20;

    public void click(By by) {
        waitElementToBeClickable(by);
        driver().findElement(by).click();
    }

    public void clickElement(By by) {
        driver().findElement(by).click();
    }

    public void input (String text , By by) {
        waitElementToBeClickable(by);
        driver().findElement(by).clear();
        driver().findElement(by).sendKeys(text);
    }

    public void waitElementToBeClickable(By by) {
        new WebDriverWait(driver(), time).until(ExpectedConditions.elementToBeClickable(by));
    }

    public boolean isElementPresent(By by) {
        try {
            return driver().findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clearFields(By by){
        driver().findElement(by).clear();
    }

    public void sleepFor(int frameTime) throws InterruptedException {
        Thread.sleep(frameTime);
    }

    public String getText(By by){
        return driver().findElement(by).getText();
    }

    public void testFail(String message){
        Assert.fail("Test has failed "+message);
    }

}
