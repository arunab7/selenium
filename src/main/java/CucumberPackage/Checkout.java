package CucumberPackage;



import jxl.common.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Checkout {
    WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this.driver);
    }

    @FindBy(how= How.LINK_TEXT,using="Jewelry")
    WebElement  Jewel;
    @FindBy(how= How.XPATH,using="//a[text()='Flower Girl Bracelet']")
    WebElement  ItemSelected;
    @FindBy(how= How.XPATH,using="//input[@id='add-to-cart-button-41']")
    WebElement  AddToCartButton;
    @FindBy(how=How.LINK_TEXT,using="Shopping cart")
    WebElement ViewShoppingCart;
    // @FindBy(how=How.ID,using="itemquantity36110")
    // WebElement BasketItem;
    @FindBy(how = How.CSS,using =".update-cart-button" )
    WebElement result;
    @FindBy(how = How.XPATH, using = "//span[@class='product-subtotal']")
    WebElement TotalAmount;
    @FindBy(how = How.CSS, using = ".qty-input")
    WebElement Quantity;

    public void ClickJewelryLink(){
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        Jewel.click();
    }
    public void SelectItemIntoBasket(){
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        ItemSelected.click();
    }
    public void ClickAddToCart(){
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        AddToCartButton.click();
    }
    public void ViewShoppingCart(){
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        ViewShoppingCart.click();
    }


    public void VerifyTotal() {
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        WebElement table = driver.findElement(By.cssSelector(".table-wrapper"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement rowele : rows) {
            List<WebElement> columns = rowele.findElements(By.tagName("td"));
            for (WebElement colelement : columns) {
                //  if(colelement.equals(TotalAmount)) {
                String exp = "$360";
                System.out.println(colelement.getText());
                Assert.verify(colelement.getText().contains(exp));
            }
        }


    }

}

