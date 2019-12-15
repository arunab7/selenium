import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExampleProperties {

    WebDriver driver;
    @Before
    public void launch() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(readValue("URL"));
        System.out.println("title of the browser" + driver.getTitle());

    }
    @Test
    public void login() throws InterruptedException, IOException {
        driver.findElement(By.name("userName")).sendKeys(readValue("UserName"));
        driver.findElement(By.name("password")).sendKeys(readValue("PassWord"));
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
    }
    @Test
    public void readProperties() throws IOException {
        FileInputStream myFile=new FileInputStream("C:\\Users\\indra_000\\IdeaProjects\\selenium\\Testdata.properties");
        Properties prop = new Properties();
        prop.load(myFile);
        System.out.println(prop.getProperty("URL"));
        System.out.println(prop.getProperty("UserName"));
        System.out.println(prop.getProperty("PassWord"));

    }
   public String readValue(String Key) throws IOException {
       FileInputStream myFile=new FileInputStream("C:\\Users\\indra_000\\IdeaProjects\\selenium\\Testdata.properties");
       Properties prop = new Properties();
       prop.load(myFile);
       return prop.getProperty(Key);
   }

}
