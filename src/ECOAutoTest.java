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
        // Input of Start Time
        WebElement StartingTime = driver.findElement(By.id("StartingTime"));
        StartingTime.clear();
        StartingTime.sendKeys("01:00");
        // Select Radio button "PM"
        driver.findElement(By.cssSelector("input[name='StartingTimeAMPM'][type='radio'][value='PM']")).click();
        // Input of LeavingDate
        WebElement LeavingDate = driver.findElement(By.id("LeavingDate"));
        LeavingDate.clear();
        LeavingDate.sendKeys(" ");
        // Input of Leaving Time
        WebElement LeavingTime = driver.findElement(By.id("LeavingTime"));
        LeavingTime.clear();
        LeavingTime.sendKeys(" ");
        // Select Radio button "PM"
        driver.findElement(By.cssSelector("input[name='LeavingTimeAMPM'][type='radio'][value='PM']")).click();
        // Click on Calculate
        WebElement Calculate = driver.findElement(By.name("Submit"));
        Calculate.submit();
        Thread.sleep(4000);
        // Close Browser
        driver.close();
    }
}
