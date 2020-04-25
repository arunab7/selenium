package CucumberPackage;

import jxl.common.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Basketpage {
    WebDriver driver;
    public Basketpage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

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

public void ClickJewelryLink(){
    driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
    Jewel.click();
}
   public void SelectItemIntoBasket(){
   driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
    ItemSelected.click();
}
public void ClickAddToCart(){
    driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
    AddToCartButton.click();
}
public void ViewShoppingCart(){
    driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
    ViewShoppingCart.click();
}


    public boolean isResultShown()
    {

        return result.isDisplayed();
    }


}
