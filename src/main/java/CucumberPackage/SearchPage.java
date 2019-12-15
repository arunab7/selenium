package CucumberPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.ID,using = "small-searchterms" )
    public WebElement SearchTextTab;
    @FindBy(how= How.CSS,using =".search-box-button")
    public WebElement SearchButton;
    @FindBy(how=How.XPATH,using="//a[text()='Pride and Prejudice']")
    public WebElement Result;

    public void setSearchTextTab(String text) {
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
         SearchTextTab.sendKeys(text);
    }
    public void ClickSearchTab(){
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        SearchButton.click();
    }

    public boolean isResultShown()
    {
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        return Result.isDisplayed();
    }
   // @Then("^the success message should be shown \"([^\"]*)\"$")
  //  public void theSuccessMessageShouldBeShown(String expectedText) throws Throwable {

      //  Assert.assertTrue(verifyTextPresent(expectedText));

   // }

   // public boolean verifyTextPresent(String text){
      //  return browser.findElement(By.tagName("body")).getText().contains(text);
    }


