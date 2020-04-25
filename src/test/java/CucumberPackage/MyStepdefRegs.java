package CucumberPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jxl.common.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MyStepdefRegs extends BaseClass{

    RegistrationPage reg=new RegistrationPage();
   // WebDriverConnector connect;

    @Given("user was in Registration page")
    public void userWasInRegistrationPage() throws IOException {
        reg.clickRegister();

    }

    @When("he selects Gender as {string}")
    public void heSelectsGenderAs(String value) {
        reg.Gender(value);

    }
    @And("Try to submit")
    public void tryToSubmit() {
     reg.Register();
    }


    @Then("he should see successfull message")
    public void heShouldSeeSuccessfullMessage() {
       // String Exp = "email already exists";
         Assert.verify(reg.SuccessMessage());

    }

    @Then("User should not able to Register")
    public void userShouldNotAbleToRegister() {
        Assert.verify(reg.Registration());
    }

    @And("logout from the system")
    public void logoutFromTheSystem() {
       reg.logout();
    }

    @And("he enters FirstName , Lastname , emailid, company,password,confirmpassword")
    public void heEntersFirstNameLastnameEmailidCompanyPasswordConfirmpassword(List<Map<String,String>> Map) {
        reg.FirstName(Map.get(0).get("fname"));
        reg.LastName(Map.get(0).get("lastname"));
        reg.Email(Map.get(0).get("EmailID"));
        reg.Company(Map.get(0).get("Company name"));
        reg.Password(Map.get(0).get("PasswordChar"));
         reg.Confirm(Map.get(0).get("Confirm Password"));
    }

    @And("selects DateOfBirth as {string} {string}{string}")
    public void selectsDateOfBirthAs(String date, String month, String year) {
        reg.DOB(date);
            reg.Month(month);
        reg.Year(year);

}}
