import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LTGAutoTest {
    public static void main(String[] args) throws InterruptedException {
        // Set the property for webdriver.chrome.driver , local path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\IdeaProjects\\Sven\\chromedriver_win32\\chromedriver.exe");
        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Visit Parking Cost Calculator
        driver.get("http://www.shino.de/parkcalc/index.php");
        // Open the Dropdown and Select "Long-Term Garage Parking"
        driver.findElement(By.cssSelector("option[value='Long-Garage']")).click();
        Thread.sleep(4000);
        // Close Browser
        driver.quit();
    }

}
