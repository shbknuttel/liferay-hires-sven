import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECOAutoTest {
    public static void main(String[] args) throws InterruptedException {
        // Set the property for webdriver.chrome.driver , local path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\IdeaProjects\\Sven\\chromedriver_win32\\chromedriver.exe");
        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Visit Parking Cost Calculator
        driver.get("http://www.shino.de/parkcalc/index.php");
        // Open the Dropdown and Select "Economy Parking"
        driver.findElement(By.cssSelector("option[value='Economy']")).click();
        // Input of Start Date
        WebElement StartDate = driver.findElement(By.id("StartingDate"));
        StartDate.clear();
        StartDate.sendKeys("11/4/2019");
        Thread.sleep(4000);

        // Close Browser
        driver.quit();
    }
}
