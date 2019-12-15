package CucumberPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyStepdefs3 {
    WebDriver driver;
    @Given("User is in BrowserPage")
    public void userIsInBrowserPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");

    }

    @When("he enters UserName and Password")
    public void heEntersUserNameAndPassword() {
        driver.findElement(By.name("userName")).sendKeys("nag022");

        driver.findElement(By.name("password")).sendKeys("mar1234");

    }

    @And("he try to login")
    public void heTryToLogin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
    }

    @Then("set the departing place to {string}")
    public void setTheDepartingPlaceTo(String arg0) {
        new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Paris");

    }

    @And("set the Returning date to {string}")
    public void setTheReturningDateTo(String arg0) {
        new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("December");

    }

    @Then("he  close the browser")
    public void heCloseTheBrowser() {
    }
}
