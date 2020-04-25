package CucumberPackage;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverUtilities;

import java.util.concurrent.TimeUnit;

public class MyStepdefsLogin extends BaseClass{

    Homepage home = new Homepage();

    @Given("User enters the Landing page")
    public void userEntersTheLandingPage() {
        home.gotoLoginPage();
    }

    @When("User enters Username as {string} and password{string}")
    public void userEntersUsernameAsAndPassword(String username, String password) throws InterruptedException {
        home.enterUserName(username);
        home.enterPassWord(password);
        home.login();
    }
    @And("Logout from the system")
    public void logoutFromTheSystem() {
        home.logout();
    }
    @Then("User should see success message")
    public void userShouldSeeSuccessMessage() throws InterruptedException {
        Assert.assertTrue(home.isUserLogged());
    }

    @Then("user should not loggedin")
    public void userShouldNotLoggedin() throws InterruptedException {
        Assert.assertTrue(home.isUserNotLogged());
    }


}
