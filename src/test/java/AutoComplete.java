import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AutoComplete {
    WebDriver driver;
    @Before
    public void launch() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/autocomplete/");
    }
    @Test
    public void autoComplete() throws InterruptedException {
        WebElement frame= driver.findElement(By.className("demo-frame"));

        driver.switchTo().frame(frame);
        driver.findElement(By.id("tags")).sendKeys("a");
               SelectOption("Java");
    }
  public void SelectOption(String Value) throws InterruptedException {
      WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
      Thread.sleep(1000);
      List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
      for (WebElement option : optionsToSelect) {
          if (option.getText().equals(Value)) {
              System.out.println("Trying to select: " + Value);
              option.click();
              break;

          }

      }
  }
}
