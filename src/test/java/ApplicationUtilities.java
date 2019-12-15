import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplicationUtilities {
    WebDriver driver;

    public ApplicationUtilities(WebDriver driver) {
        this.driver=driver;
    }

    public void Select_Checkbox_from_List(String propType, String AttrValue){
        List<WebElement> Checkbox= driver.findElements(By.name( propType));
        for(WebElement option: Checkbox){
            if(AttrValue.equals(option.getAttribute("value"))){
                option.click();
                break;

            }
        }
    }
    public void SelectFromDropdown(String proptype, String text){

    }
    public void SelectFromDropdown(String proptype, int indexval){
        new Select(driver.findElement(By.name(proptype))).selectByIndex(indexval);
    }
}
