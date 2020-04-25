package CucumberPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.WebDriverUtilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationPage extends BaseClass{

    @FindBy(how = How.LINK_TEXT, using = "Register")
    public WebElement RegisterLink;
    @FindBy(how = How.NAME, using = "Gender")
    List<WebElement> Gender;
    @FindBy(how = How.ID, using = "FirstName")
    WebElement FirstName;
    @FindBy(how = How.ID, using = "LastName")
    WebElement LastName;
    @FindBy(how = How.NAME, using = "DateOfBirthDay")
    WebElement Date;
    @FindBy(how = How.NAME, using = "DateOfBirthMonth")
    WebElement Month;
    @FindBy(how = How.NAME, using = "DateOfBirthYear")
    WebElement CYear;
    @FindBy(how = How.ID, using = "Email")
    WebElement MailId;
    @FindBy(how = How.ID, using = "Company")
    WebElement CompanyName;
    @FindBy(how = How.ID, using = "Password")
    WebElement RPassword;
    @FindBy(how = How.ID, using = "ConfirmPassword")
    WebElement ConfirmPassword;
    @FindBy(how = How.ID, using = "register-button")
    WebElement RegisterButton;
    @FindBy(how = How.TAG_NAME, using = "body")
    WebElement result;
    @FindBy(how = How.TAG_NAME, using = "body")
    WebElement message;
    @FindBy(how = How.LINK_TEXT, using = "Log out")
    public WebElement logoutLink;
    WebDriverUtilities util = new WebDriverUtilities();
    public void clickRegister(){
        RegisterLink.click();

    }
    public void logout() {
        logoutLink.click();
    }

    public void Gender(String value) {
        try {
            for (WebElement radio : Gender) {
                if (radio.getAttribute("value").equals(value)) {
                    radio.click();
                }
            }
        } catch (Exception ie) {

            ie.getMessage();
        }
    }

    public void FirstName(String fname){
        FirstName.sendKeys(fname);
    }

    public void LastName(String lastname) {
        LastName.sendKeys(lastname);
    }

    public void DOB(String date) {
        new Select(Date).selectByValue(date);

    }

    public void Month(String month) {


        new Select(Month).selectByVisibleText(month);
    }

    public void Year(String year) {

        new Select(CYear).selectByValue(year);
    }

    public void Email(String email) {
        MailId.sendKeys(email);
    }

    public void Company(String Company) {

        CompanyName.sendKeys(Company);
    }

    public void Password(String password) {
        RPassword.sendKeys(password);
    }

    public void Confirm(String Cpassword) {
        ConfirmPassword.sendKeys(Cpassword);
    }

    public void Register() {
        RegisterButton.click();
    }

    public boolean SuccessMessage() {
       // String Exp = "Your registration completed";
        return util.verifyTextPresentOnPage("Your registration completed");
    }
    public boolean Registration() {
        //String Exp = "The specified email already exists";
        return util.verifyTextPresentOnPage("The specified email already exists");
    }
    }

