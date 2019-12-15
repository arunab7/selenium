package CucumberPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyStepdefRegs {
    WebDriver driver;
    RegistrationPage reg;
    @Given("user was in Registration page")
    public void userWasInRegistrationPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        reg= PageFactory.initElements(driver, RegistrationPage.class);
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");


    }

    @When("he selects Gender as {string}")
    public void heSelectsGenderAs(String value) {
        reg.Gender(value);

    }

    @And("he enters FirstName as {string}")
    public void heEntersFirstNameAs(String Fname) {
     reg.FirstName(Fname);
    }

    @And("he enters LastName as {string}")
    public void heEntersLastNameAs(String Lname) {
     reg.LastName(Lname);
    }

    @And("selects DateOfBirth as {string}")
    public void selectsDateOfBirthAs(String date) {
   reg.DOB(date);
    }

    @And("selects Month as{string}")
    public void selectsMonthAs(String month) {
   reg.Month(month);
    }

    @And("selects Year as{string}")
    public void selectsYearAs(String year) {
     reg.Year(year);
    }

    @And("enters email as {string}")
    public void entersEmailAs(String email) {
        reg.Email(email);
    }


    @When("he enters Company name as{string}")
    public void heEntersCompanyNameAs(String company) {
  reg.Company(company);
    }


    @And("he enters Password as {string}")
    public void heEntersPasswordAs(String password) {
     reg.Password(password);
    }

    @And("he enters Confirm Password as {string}")
    public void heEntersConfirmPasswordAs(String Cpassword) {
     reg.Confirm(Cpassword);
    }

    @And("Try to submit")
    public void tryToSubmit() {
     reg.Register();
    }

    @Then("he should closing the browser")
    public void heShouldClosingTheBrowser() {
        driver.close();
    }
}
