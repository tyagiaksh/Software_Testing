import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tabswitcher {
    WebDriver driver;
    @Given("I am on the home page tab")
    public void iAmOnTheHomePageTab() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }

    @When("I click on the component")
    public void iClickOnTheComponent() {
        driver.findElements(By.cssSelector(".tab-switch-section"));

    }

    @Then("I am taken to the component div")
    public void iAmTakenToTheComponentDiv() {
        WebElement strategyTab = driver.findElement(By.cssSelector("div.body-tab:nth-child(1)"));
        if(strategyTab.isDisplayed()){
            System.out.println("Strategy tab is visible");
        }

        WebElement service = driver.findElement(By.xpath("/html/body/div[2]/section[4]/div/div/div[2]/section/div/div/div[1]/div[2]/p"));
        service.click();
        WebElement serviceTab = driver.findElement(By.cssSelector("div.body-tab:nth-child(2)"));
        if(serviceTab.isDisplayed()){
            System.out.println("Service tab is visible");
        }

        WebElement accelerator = driver.findElement(By.xpath("/html/body/div[2]/section[4]/div/div/div[2]/section/div/div/div[1]/div[3]/p"));
        accelerator.click();
        WebElement acceleratorTab = driver.findElement(By.cssSelector("div.body-tab:nth-child(3)"));
        if(acceleratorTab.isDisplayed()){
            System.out.println("accelerator tab is visible");
        }

        WebElement dataOps = driver.findElement(By.xpath("/html/body/div[2]/section[4]/div/div/div[2]/section/div/div/div[1]/div[4]/p"));
        dataOps.click();
        WebElement dataOpsTab = driver.findElement(By.cssSelector("div.body-tab:nth-child(4)"));
        if(dataOpsTab.isDisplayed()){
            System.out.println("dataOps tab is visible");
        }

        WebElement hybridClouds = driver.findElement(By.xpath("/html/body/div[2]/section[4]/div/div/div[2]/section/div/div/div[1]/div[5]/p"));
        hybridClouds.click();
        WebElement hybridCloudsTab = driver.findElement(By.cssSelector("div.body-tab:nth-child(5)"));
        if(hybridCloudsTab.isDisplayed()){
            System.out.println("hybridClouds tab is visible");
        }

        WebElement managedServices = driver.findElement(By.xpath("/html/body/div[2]/section[4]/div/div/div[2]/section/div/div/div[1]/div[6]/p"));
        managedServices.click();
        WebElement managedServicesTab = driver.findElement(By.cssSelector("div.body-tab:nth-child(6)"));
        if(managedServicesTab.isDisplayed()){
            System.out.println("managedServices tab is visible");
        }

    }
}
