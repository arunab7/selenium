package CucumberPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyStepdefs {
   public WebDriver driver;
   public Basketpage basket;
    @Given("user is in landing page")
    public void userIsInLandingPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      //  Basketpage basket=new Basketpage(driver);
        basket= PageFactory.initElements(driver, Basketpage.class);
        driver.get("http://demo.nopcommerce.com");
    }

    @When("add default item to basket")
    public void addDefaultItemToBasket() {
       // Basketpage basket=new Basketpage(driver);
        basket.ClickJewelryLink();
        basket.SelectItemIntoBasket();
        basket.ClickAddToCart();
    }

    @And("go to shopping cart")
    public void goToShoppingCart() {
      //  Basketpage basket=new Basketpage(driver);
        basket.ViewShoppingCart();
    }

    @Then("he should see the result")
    public void heShouldSeeTheResult() {
        Assert.assertTrue(basket.isResultShown());
    }

    @Then("he should close the browserpage")
    public void heShouldCloseTheBrowserpage() {
        driver.quit();
    }
}
