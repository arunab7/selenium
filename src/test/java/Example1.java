import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Example1 {
    WebDriver driver;

    @Before
    public void launch() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    @Test
    public void Verification() {
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.findElement(By.linkText("Jewelry")).click();
        driver.findElement(By.xpath("//a[text()='Flower Girl Bracelet']")).click();
        driver.findElement(By.cssSelector(".add-to-cart-button")).click();
        driver.findElement(By.linkText("Shopping cart")).click();
        WebElement table = driver.findElement(By.cssSelector(".cart"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement rowele : rows) {
            List<WebElement> columns = rowele.findElements(By.tagName("td"));
            for (WebElement colelement : columns) {
                  Assert.assertTrue(colelement.getText().contains("$"));
                 if (colelement.getText().contains("$")) {

                   System.out.println(colelement.getText());

                  }

       // String txt = colelement.findElement(By.xpath("//span[@class='product-unit-price']")).getText();
        // System.out.println("netprice amount"+txt);
       //  break;
    }
}
       // driver.findElement(By.id("termsofservice")).click();
       // driver.findElement(By.cssSelector(".button-1.checkout-button")).click();
      // String act= driver.findElement(By.tagName("body")).getText();
       //String Exp="Welcome";
             //  Assert.assertTrue(act.contains(Exp));
        // driver.findElement(By.cssSelector(".button-1.checkout-as-guest-button")).click();

        //  driver.findElement(By.cssSelector(".button-2 add-to-wishlist-button")).click();
        // driver.findElement(By.cssSelector(".datepicker hasDatepicker")).click();
        // driver.findElement(By.cssSelector(".ui-state-default ui-state-active")).click();
        // driver.findElement(By.id("rental_end_date_40")).click();
        // driver.findElement(By.cssSelector(".ui-state-default")).click();
    }

    @Test
    public void Calender() {
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.findElement(By.cssSelector(".k-icon.k-i-calendar")).click();
        System.out.println("Calendar Found");
        selectKendoDate("15");
    }

    public void selectKendoDate(String date) {
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        WebElement table = driver.findElement(By.className("k-content"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));
        for(WebElement rows : tableRows){
            List<WebElement>tableColumns = rows.findElements(By.tagName("td"));
            for(WebElement columns : tableColumns){
                if(columns.getText().equals(date)){
                    driver.findElement(By.linkText(date)).click();
                }
            }
        }
    }
    @Test
    public void Amazon(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("KidsToys");
        driver.findElement(By.cssSelector("input[type=submit")).click();
       // ((JavascriptExecutor) driver).executeScript(
             //   "arguments[0].scrollIntoView();",ele);
      // WebElement ele= driver.findElement(By.xpath("a//[@href='https://www.amazon.co.uk/Disney-Girls-Story-Pyjamas-Multicoloured/dp/B07TJT5F3X/ref=sr_1_10?dchild=1&keywords=kids+toys&qid=1576150977&s=clothing&sr=1-10'"));
      // ele.click();
       driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.id("nav-cart")).click();
       // Alert alert=driver.switchTo().alert();

       // alert.accept();
       // alert.dismiss();
      // driver.findElement(By.linkText("Vouchers")).click();
      // driver.findElement(By.linkText("Baby Care")).click();
      //  driver.findElement(By.xpath("//a[@text='Save £60 on Baby Monitor eufy Security SpaceView Video Baby Monitor T8300']")).click();
       // driver.findElement(By.linkText("\n" +
            //    "          Save 10% on Personalised Gifts\n" +
            //    "        ")).click();
       // driver.findElement(By.id("inline-atc-button-AN78TU1BH1IKFB07WDFPQV4")).click();
       // driver.findElement(By.id("nav-cart")).click();
        //  driver.findElement(By.xpath("//a[@href='https://www.amazon.co.uk/gp/help/customer/display.html?ie=UTF8&%2AVersion%2A=1&%2Aentries%2A=0&nodeId=201149560']")).click();
    }



}