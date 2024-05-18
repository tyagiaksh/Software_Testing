import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class navbar {
    WebDriver driver;
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }

    @When("I hover over the {string} button in the navbar")
    public void iHoverOverTheButtonInTheNavbar(String arg0) {
        WebElement Button = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[3]/div[1]/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Button).build().perform();
    }

    @Then("the {string} is displayed")
    public void theIsDisplayed(String arg0) {
        WebElement aboutDiv = driver.findElement(By.id("header-drop"));
        String aboutDivDisplay = aboutDiv.getCssValue("display");
        Assert.assertEquals(aboutDivDisplay, "block", "The 'about-div' was not displayed");
    }
}
