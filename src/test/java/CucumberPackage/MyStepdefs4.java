package CucumberPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs4 {
    WebDriver driver;
    @Given("user is in login page")
    public void userIsInLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/login");
    }

    @When("us enters user name as {string} and password as {string}")
    public void usEntersUserNameAsAndPasswordAs(String username, String password) {
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);

    }

    @And("user try to login")
    public void userTryToLogin() {
        driver.findElement(By.cssSelector(".login-button")).click();
        
    }

    @Then("he should be not be login")
    public void heShouldBeNotBeLogin() {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Welcome, Please Sign In!"));
    }
      //  Assert.assertFalse(driver.findElement(By.tagName("body")).getText().contains("Welcome to our store"));

    public static class MyStepdefs5 {
        @Given("he go to home page")
        public void heGoToHomePage() {
        }
    }
}


