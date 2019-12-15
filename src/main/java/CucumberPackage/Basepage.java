package CucumberPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage {

    public abstract class BasePage {

        public WebDriver driver;

        public BasePage(WebDriver browser){
            this.driver = browser;
            PageFactory.initElements(driver,this);
        }
    }

}
