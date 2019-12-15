import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class PomExapleTestcases {
    Login login;
    WebDriver driver;
    ApplicationUtilities utilities;
    pomexapleproperties prop;
    PomExampleFlights flights;

    public PomExapleTestcases() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        utilities = new ApplicationUtilities(driver);
        prop = new pomexapleproperties(driver);
        login = new Login(driver);
        flights = new  PomExampleFlights(driver);
    }
    @Test
    public void BookFlights() throws InterruptedException, IOException {
        login.launchNewTours();
        login.loginToNewTours();
        flights.bookFlight();
        login.logout();
    }

    }

