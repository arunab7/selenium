package CucumberPackage;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;


@RunWith(Cucumber.class)
@CucumberOptions( tags = {"@Login"}


       // features = {"src/test/Resources"})
)

public class CucumberRunner {
    @BeforeClass
    public static void startBrowser(){
        BrowserFactory.browserInitialize();
        BrowserFactory.getDriver().get("https://demo.nopcommerce.com");

    }

    @AfterClass
    public static void stop(){
        BrowserFactory.tearDown();
    }
}
