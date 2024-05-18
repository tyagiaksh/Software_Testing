import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class navigation {

    WebDriver driver;

    @Given("I am on a random page of the website")
    public void iAmOnARandomPageOfTheWebsite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/services/kubernetes/");
    }

    @When("I click on the logo")
    public void iClickOnTheLogo() {
        WebElement logo = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/nav/div/ul[1]/li[1]/a/img"));
        logo.click();
    }

    @Then("I am taken to the home page of the website")
    public void iAmTakenToTheHomePageOfTheWebsite() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.endsWith("/"), "The user was not taken to the home page");
    }
}
