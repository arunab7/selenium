package utilities;

import CucumberPackage.BaseClass;
import org.openqa.selenium.By;

public class WebDriverUtilities extends BaseClass {
    public boolean verifyTextPresentOnPage(String text){
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }
}
