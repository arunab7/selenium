package CucumberPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class MyStepdefs6 {
    static WebDriver browser;

    @Given("go to home page")
    public void goToHomePage() {
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://demo.nopcommerce.com");
    }

    @When("he open the {string} link")
    public void heOpenTheLink(String  link) {
        browser.findElement(By.linkText("Facebook")).click();

    }

    @Then("the page in new TAB should be open with text {string}")
    public void thePageInNewTABShouldBeOpenWithText(String text) {
        Set<String> windowList = browser.getWindowHandles();
        System.out.println(windowList);
        //ArrayList<String> windows=new Arraylist<String>(windowList);
        Object[] arrayList = windowList.toArray();
        browser.switchTo().window(arrayList[1].toString());
        browser.navigate().refresh();
        String textInBrowser = browser.findElement(By.tagName("body")).getText();
        browser.switchTo().defaultContent();
        Assert.assertTrue(textInBrowser.contains(text));
    }

    @When("he open the Footer link as {string}link")
    public void heOpenTheFooterLinkAsLink(String Footerlink) {
        browser.findElement(By.linkText(Footerlink)).click();
    }

    @Then("the page should display page in text as {string}")
    public void thePageShouldDisplayPageInTextAs(String text) {
        Assert.assertTrue(browser.findElement(By.tagName("body")).getText().contains(text));
    }
}
