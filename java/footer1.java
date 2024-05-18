import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;

public class footer1 {

    WebDriver driver;
    @Given("I am on the home page Footer")
    public void iAmOnTheHomePageFooter() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }
    @When("I click on the {string} Div")
    public void iClickOnTheDiv(String arg0) {
        driver.findElements(By.xpath("//div[@class='xenonstack-footer-linking-inside']"));
    }

    @Then("I am taken to the Loop")
    public void iAmTakenToTheLoop() {
        List<WebElement> divs = driver.findElements(By.xpath("//div[@class='xenonstack-footer-linking-inside']/h3"));
        for (WebElement div : divs) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", div);
            List<WebElement> links = div.findElements(By.xpath("//div[@class='xenonstack-footer-linking-inside']/a"));
            for (WebElement link : links) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", link);
                if (link.isDisplayed()) {
                    String linkText = link.getText();
                    link.click();
                    driver.navigate().back();
                    System.out.println("Clicked on link: " + linkText + " in div.");
                }
            }
        }
    }

}
