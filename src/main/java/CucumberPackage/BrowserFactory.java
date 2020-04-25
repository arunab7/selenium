package CucumberPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver getDriver() {
       return driver;
   }

    public static WebDriver browserInitialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }


    public static void tearDown() {
        System.out.println("Quit the browser !");
        driver.quit();
    }
}
