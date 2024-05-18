import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class navbar1 {
    WebDriver driver;
    @Given("I am on the home page 1")
    public void iAmOnTheHomePage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }

    @When("I hover over the {string} button in the navbar 1")
    public void iHoverOverTheButtonInTheNavbar(String arg0) {
        WebElement Button = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/ul[1]/li[3]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Button).build().perform();
    }

    @Then("the {string} is displayed 1")
    public void theIsDisplayed(String arg0) {
        WebElement aboutDiv = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/ul[1]/li[3]/div"));
        String aboutDivDisplay = aboutDiv.getCssValue("display");
        Assert.assertEquals(aboutDivDisplay, "block", "The 'about-div' was not displayed");
    }
}
