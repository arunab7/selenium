package CucumberPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationPage {
    WebDriver driver;
    private static Logger log = LoggerFactory.getLogger(RegistrationPage.class);

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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

    public void Gender(String value) {
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        try {
            for (WebElement radio : Gender) {
                if (radio.getAttribute("value").equals(value)) {
                    radio.click();
                }
            }
        }catch (Exception ie) {
            log.error("unable to locate Gender");
            ie.getMessage();
        }  }

    public void FirstName(String Fname){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        try {
            FirstName.sendKeys(Fname);
        } catch(Exception e){
        e.printStackTrace();}
    }
    public void LastName(String Lname){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        try {
            LastName.sendKeys(Lname);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void DOB(String date){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        new Select(Date).selectByValue(date);

    }
    public void Month(String month){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        new Select(Month).selectByVisibleText(month);
    }
    public void Year(String year){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        new Select(CYear).selectByValue(year);
    }
    public void Email(String email){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        MailId.sendKeys(email);
    }
    public void Company(String Company){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        CompanyName.sendKeys(Company);
    }
    public void Password(String password){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        RPassword.sendKeys(password);
    }
    public void Confirm(String Cpassword){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        ConfirmPassword.sendKeys(Cpassword);
    }
    public void Register()
    {
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        RegisterButton.click();

    }
}