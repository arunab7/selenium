import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class ExampleSelect {
    WebDriver driver;
    ApplicationUtilities utilities;
    pomexapleproperties prop;
    public  ExampleSelect() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        utilities = new ApplicationUtilities(driver);
        prop = new pomexapleproperties(driver);
    }
    @Before
    public void launch() throws IOException {

        driver.get(prop.readValue("URL"));
        System.out.println("title of the browser" + driver.getTitle());

    }
    @Test
    public void login() throws InterruptedException, IOException {
        driver.findElement(By.name("userName")).sendKeys(prop.readValue("UserName"));
        driver.findElement(By.name("password")).sendKeys(prop.readValue("PassWord"));
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
    }
    @Test
    public void bookFlight() throws InterruptedException,IOException {
        login();
       utilities. Select_Checkbox_from_List("tripType","oneway");
       utilities. Select_Checkbox_from_List("servClass","Business");
        utilities. SelectFromDropdown("fromPort","London");
       utilities. SelectFromDropdown("fromMonth",11);
       utilities. SelectFromDropdown("toDay","28");
       utilities. SelectFromDropdown("toPort",3);
       utilities. SelectFromDropdown("toMonth",10);
    }
  // public void Select_Checkbox_from_List(String propType, String AttrValue){
      //  List<WebElement> Checkbox= driver.findElements(By.name( propType));
      //  for(int i=0;i<Checkbox.size();i++){
         //   if(Checkbox.get(i).getAttribute("value").equals(AttrValue)){
         //  Checkbox.get(i).click();
         //  break;

          //  }
         //   }
      //  }
    //      public void Select_Checkbox_from_List(String propType, String AttrValue){
          //     List<WebElement> Checkbox= driver.findElements(By.name( propType));
           //     for(WebElement option: Checkbox){
           //     if(AttrValue.equals(option.getAttribute("value"))){
           //    option.click();
            //   break;

            //   }
            //    }
   // }
      //  public void SelectFromDropdown(String proptype, String text){
     //   new Select(driver.findElement(By.name(proptype))).selectByVisibleText(text);
      //  }
  //  public void SelectFromDropdown(String proptype, int indexval){
     //   new Select(driver.findElement(By.name(proptype))).selectByIndex(indexval);
  //  }
   }

