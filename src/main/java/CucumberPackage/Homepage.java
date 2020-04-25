package CucumberPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WebDriverUtilities;

import java.util.concurrent.TimeUnit;

public class Homepage extends BaseClass {

    @FindBy(how = How.LINK_TEXT, using = "Log in")
    public WebElement loginLink;
    @FindBy(how = How.ID, using = "Email")
    public WebElement usernameText;

    @FindBy(how = How.ID, using = "Password")
    public WebElement passwordText;

    @FindBy(how = How.XPATH, using = "//input[@value='Log in']")
    public WebElement submit;

    @FindBy(how = How.TAG_NAME, using = "body")
    public WebElement bodyText;
    @FindBy(how = How.LINK_TEXT, using = "Log out")
    public WebElement logoutLink;
    WebDriverUtilities util = new WebDriverUtilities();

    public void gotoLoginPage() {
        loginLink.click();

    }

    public void enterUserName(String uname) throws InterruptedException {
      // Thread.sleep(2000);
        usernameText.sendKeys(uname);
    }

    public void enterPassWord(String password) {

        passwordText.sendKeys(password);
    }


    public void login() {

        submit.click();
    }

    public void logout() {
        logoutLink.click();
    }

    public boolean isUserLogged()  {

        return util.verifyTextPresentOnPage("Welcome to our store");
    }

    public boolean isUserNotLogged() {
        return util.verifyTextPresentOnPage("Wrong email");
    }
}
