package CucumberPackage;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Reg",features = "src/test/Resources")


public class CucumberRunner {
}
