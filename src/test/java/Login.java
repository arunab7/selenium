import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Login {
    WebDriver driver;
    ApplicationUtilities utilities;
    pomexapleproperties prop;

    public Login(WebDriver driver) {
        this.driver=driver;
        utilities = new ApplicationUtilities(driver);
        prop = new pomexapleproperties(driver);
    }

    public void launchNewTours() throws IOException {

        driver.get(prop.readValue("URL"));
        driver.get("http://newtours.demoaut.com/");
        System.out.println("title of the browser" + driver.getTitle());

    }

    public void loginToNewTours() throws InterruptedException, IOException {
        System.out.println("loginTo  new Tours");
       driver.findElement(By.name("userName")).sendKeys(prop.readValue("UserName"));
        driver.findElement(By.name("password")).sendKeys(prop.readValue("PassWord"));

      /*  ame("password")).sendKeys("mar1234");By.name("userdriver.findElement(Name")).sendKeys("nag022");
        driver.findElement(By.n
      */

      Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
    }

    public void logout(){
        System.out.println("logout from new Tours");
        driver.findElement(By.linkText("SIGN-OFF")).click();
    }
}
