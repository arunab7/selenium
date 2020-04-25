package CucumberPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ExampleMeddbase {

    WebDriver driver;
    @Before
    public void launch() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.patientbooking.co.uk/#/login");
       // driver.get("https://demo.patientbooking.co.uk/#/main");
        System.out.println("title of the browser" + driver.getTitle());

    }
    @Test
    public void login() throws InterruptedException, IOException {
        driver.findElement(By.id("inputEmail")).sendKeys("sahithi@gmail.com");
       driver.findElement(By.id("inputPassword")).sendKeys("Sahithi0416$");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".text")).click();
    }
}
