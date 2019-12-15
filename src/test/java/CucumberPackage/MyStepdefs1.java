package CucumberPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs1 {
    WebDriver driver;
    @Given("User opened the browser")
    public void userOpenedTheBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("he go to homepage")
    public void heGoToHomepage() {
        driver.get("http://newtours.demoaut.com/");

    }

    @Then("close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }
}
