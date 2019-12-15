package CucumberPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage  {
    WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.NAME,using = "userName" )
    public WebElement usernameText;
    @FindBy(how= How.NAME,using ="password")
    public WebElement passwordText;
    @FindBy(how=How.NAME,using="login")
    public WebElement login;
    public void EntersUsername() throws InterruptedException {
        Thread.sleep(1000);
        usernameText.sendKeys("nag022");

    }
    public void EntersPassword() {

        passwordText.sendKeys("mar1234");
    }
    public void login() throws InterruptedException {
        Thread.sleep(1000);
        login.click();
    }
}
