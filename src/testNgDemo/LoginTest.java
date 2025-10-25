package testNgDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class LoginTest {
 WebDriver driver;

 @BeforeClass
    public void launchBrowser() {
        ChromeOptions options = new ChromeOptions();
        //  options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        String browser="chrome";

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please pass the correct browser: " + browser);
        }
        // driver.manage().window().maximize();

    }
@AfterClass
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

@Test
    public void handleCalender(){
        // February 2026 17
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.findElement(By.name("my-date")).click();
        String caldata=   driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]")).getText();
        //   WebElement cal=  driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]"));
        System.out.println(caldata);
        String month=  caldata.split(" ")[0].trim();
        String year= caldata.split(" ")[1].trim();
        System.out.println("Month: "+month+" Year: "+year);
        while(!(month.equals("February") && year.equals("2026"))){
            driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[3]")).click();
            caldata=   driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]")).getText();
            month=  caldata.split(" ")[0].trim();
            year= caldata.split(" ")[1].trim();
        }
//select  17 th of the month
        driver.findElement(By.xpath("//td[normalize-space()='17']")).click();
        // click outside the calendar
        driver.findElement(By.xpath("//h1")).click();

    }

    @Test
    public void captureScreenShot() throws IOException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.findElement(By.name("my-date")).click();
        //type casting driver object to TakesScreenshot interface
        TakesScreenshot ts=    (TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("E:\\screenshot\\calender.jpg"))  ;


        //capture screenshot of a specific element
        WebElement cal=   driver.findElement(By.xpath("//div[@class='datepicker-days']"));
        file= cal.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("E:\\screenshot\\calenderElement.jpg"))  ;

    }
}
