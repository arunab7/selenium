package CucumberPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyStepdefsSearch {
    public WebDriver driver;
    public SearchPage search;
    @Given("he go to  search page")
    public void heGoToSearchPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //  Basketpage basket=new Basketpage(driver);
        search= PageFactory.initElements(driver, SearchPage.class);
        driver.get("http://demo.nopcommerce.com");
    }

    @When("search with keyword {string}")
    public void searchWithKeyword(String text) {
        search.setSearchTextTab(text);
        search.ClickSearchTab();

    }
    @Then("he should successfully see the product")
    public void heShouldSuccessfullySeeTheProduct() {
        Assert.assertTrue(search.isResultShown());
    }
}
