import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaits {
    WebDriver driver;
    public static void main(String[] args) {
        SeleniumWaits obj = new SeleniumWaits();
        obj.launchBrowser("chrome");
        obj.checkDOneStatus();
       obj.closeBrowser();
    }

    public void launchBrowser(String browser) {
        ChromeOptions options = new ChromeOptions();
        //  options.addArguments("--incognito");
        options.addArguments("--headless=new");
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
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //  Thread.sleep(10000);

    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

//implicit wait example
    public void checkloadingImages(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
     WebElement landscap= driver.findElement(By.xpath("//img[@id='landscape']"));
        System.out.println(landscap.isDisplayed());
    }
  //explicit wait example
  public void checkStatus(){
      driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
   //   WebElement hiddenEle= driver.findElement(By.xpath("//p[contains(text(),'Done!')]"));
     //explicit wait
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Done!')]")));
   //   wait.until(ExpectedConditions.visibilityOf(hiddenEle));
      WebElement hiddenEle= driver.findElement(By.xpath("//p[contains(text(),'Done!')]"));
      System.out.println(hiddenEle.isDisplayed());
  }

  //fluent wait example
    public void checkDOneStatus(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");
        FluentWait<WebDriver>  wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                        .pollingEvery(Duration.ofMillis(200))
                                .ignoring(NoSuchElementException.class);

        //   WebElement hiddenEle= driver.findElement(By.xpath("//p[contains(text(),'Done!')]"));
        //explicit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Done!')]")));
        WebElement hiddenEle= driver.findElement(By.xpath("//p[contains(text(),'Done!')]"));
        System.out.println(hiddenEle.isDisplayed());
    }

}
