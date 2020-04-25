package CucumberPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

    public WebDriver driver;

    public BaseClass(){
        driver = BrowserFactory.getDriver();
        PageFactory.initElements(driver,this);
    }
}
