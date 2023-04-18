package browserfectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver ;
    public void openBrowser(String baseUrl){
        //give key and copy value from drivers file.
        System.setProperty("WebDriver.chrome.driver","drivers/chromedriver.exe");
        // Creating an object
        driver = new ChromeDriver();

        // Launch the Url
        driver.get(baseUrl);

        // Maximize Window
        driver.manage().window().maximize();

        // Implicit Time Out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
     public void closeBrowser() {      // Close Browser
        driver.quit();
     }
}
