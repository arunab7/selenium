package CucumberPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs2 {
    WebDriver driver;
    Homepage home;

    @Given("User is in LoginPage")
    public void userIsInLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Homepage home=new Homepage(driver);
        driver.get("http://newtours.demoaut.com/");
    }
    @When("he enters username")
    public void heEntersUsername() throws InterruptedException {
        Homepage home=new Homepage(driver);
        home.EntersUsername();
    }


    @And("he enters password")
    public void heEntersPassword() {
        Homepage home=new Homepage(driver);

        home.EntersPassword();

    }
    @And("try to login")
    public void tryToLogin() throws InterruptedException {
        Homepage home=new Homepage(driver);
        Thread.sleep(1000);
        home.login();
    }

    @Then("he should close the browser")
    public void heShouldCloseTheBrowser() {
        driver.quit();
    }


}
