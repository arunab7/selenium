import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
    WebDriver driver;
    @Test
    public void launch() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/autocomplete/");

        WebElement element = driver.findElement(By.linkText("Download"));
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
    }
    @Test
    public void Sublinks() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com");
        WebElement Menu = driver.findElement(By.linkText("Demos"));

        WebElement SubMenu = driver.findElement(By.linkText("Draggable"));
        Actions action = new Actions(driver);
        action.moveToElement(Menu).moveToElement(SubMenu).click().build().perform();

    }
    @Test
    public void DragandDrop(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);
        WebElement Source = driver.findElement(By.cssSelector(".ui-draggable"));

        WebElement Destination = driver.findElement(By.cssSelector(".ui-droppable"));
        Actions action = new Actions(driver);
        action.clickAndHold(Source ).moveToElement(Destination).release().build().perform();


    }
    @Test
    public void ContextMenuClick() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
        WebElement element = driver.findElement(By.className("context-menu-one "));
        Thread.sleep(1000);
        Actions action = new Actions(driver).contextClick(element);
        action.build().perform();
        WebElement editelement =  driver.findElement(By.cssSelector(".context-menu-icon .context-menu-icon-edit "));
        editelement.click();
        Alert alert=driver.switchTo().alert();
        String textEdit = alert.getText();
        Assert.assertEquals(textEdit, "clicked: edit", "Failed to click on Edit link");
    }
}
