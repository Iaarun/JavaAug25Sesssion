import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SeleniumWaits {
    WebDriver driver;
    public static void main(String[] args) {
        SeleniumWaits obj = new SeleniumWaits();
        obj.launchBrowser("chrome");
        obj.checkloadingImages();
   //     obj.closeBrowser();
    }

    public void launchBrowser(String browser) {
        ChromeOptions options = new ChromeOptions();
        //  options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please pass the correct browser: " + browser);
        }
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //  Thread.sleep(10000);

    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }


    public void checkloadingImages(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
     WebElement landscap= driver.findElement(By.xpath("//img[@id='landscape']"));
        System.out.println(landscap.isDisplayed());
    }
}
