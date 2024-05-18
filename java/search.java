import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class search {
    WebDriver driver;

    @Given("I am on the home page of the website")
    public void iAmOnTheHomePageOfTheWebsite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }

    @When("I click on the search bar")
    public void iClickOnTheSearchBar() {

        WebElement Search = driver.findElement(By.cssSelector("#search-menu > img:nth-child(1)"));
        Search.click();
    }

    @And("a div opens with a search input")
    public void aDivOpensWithASearchInput() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/header/div/div[2]/div/div[1]/div/div/div/div/div/form/input")));
        searchInput.sendKeys("Test ops");
        searchInput.sendKeys(Keys.ENTER);
    }

    @Then("the search results are displayed")
    public void theSearchResultsAreDisplayed() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("hs-search-results"), "The search results were not displayed");
    }
}
