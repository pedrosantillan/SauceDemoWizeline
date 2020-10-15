package hooks;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseClass;

import java.io.IOException;

public class hook extends BaseClass {
    @Before
    public void setUp(Scenario scenario) throws IOException {
        startDriver("local","Chrome");
        driver().get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown(Scenario scenario){
        driver().close();
        driver().quit();
    }
}

