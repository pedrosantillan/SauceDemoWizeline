package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    static Logger Logger = LoggerFactory.getLogger(BaseClass.class);

    public static WebDriver driver() {

        return  DriverSetUp.getDriver();
    }

    public void startDriver(String localOrRemote, String browserName) throws IOException {
        WebDriver driver = driver();
        if (localOrRemote.equals("local") && browserName.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/utilities/chromedriver");
            driver = new ChromeDriver(getChromeOptions());
        }
        else if (localOrRemote.equals("local") && browserName.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\utilities\\geckodriver.exe");
            driver = new FirefoxDriver(getFirefoxOptions());
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        DriverSetUp.setDriver(driver);
    }

    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("screenshot");
        options.addArguments("start-maximized");
        options.addArguments("no-sandbox");
        options.addArguments("disable-infobars");
        options.setCapability("enableVideo",true);
        return options;
    }

    public FirefoxOptions getFirefoxOptions(){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("screenshot");
        options.addArguments("start-maximized");
        options.addArguments("no-sandbox");
        options.addArguments("disable-infobars");
        options.setCapability("enableVideo",true);
        return options;
    }
}
