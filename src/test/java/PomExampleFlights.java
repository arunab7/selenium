import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class PomExampleFlights {
    WebDriver driver;
    ApplicationUtilities utilities;
    pomexapleproperties prop;
    public  PomExampleFlights(WebDriver driver) {
        this.driver=driver;
        utilities = new ApplicationUtilities(driver);
        prop = new pomexapleproperties(driver);
    }
    public void bookFlight() throws InterruptedException, IOException {
        utilities. Select_Checkbox_from_List("tripType","oneway");
        utilities. Select_Checkbox_from_List("servClass","Business");
        utilities. SelectFromDropdown("fromPort","London");
        utilities. SelectFromDropdown("fromMonth",11);
        utilities. SelectFromDropdown("toDay","28");
        utilities. SelectFromDropdown("toPort",3);
        utilities. SelectFromDropdown("toMonth",10);
    }
}
