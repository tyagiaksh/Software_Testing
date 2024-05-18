import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class contactus {
    WebDriver driver;
    @Given("I am on the form page")
    public void iAmOnTheFormPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/contact-us/");
    }

    @When("I click on the next button")
    public void iClickOnTheNextButton() {
        WebElement nextButton = driver.findElement(By.id("next-1"));
        nextButton.click();
    }

    @Then("an error message is displayed saying {string}")
    public void anErrorMessageIsDisplayedSaying(String arg0) {
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        String errorMessageText = errorMessage.getText();
        Assert.assertEquals(errorMessageText, "Please fill in all the fields before proceeding.", "The error message was not displayed");
    }
}
