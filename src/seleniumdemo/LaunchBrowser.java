package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
    WebDriver driver1;
    public static void main(String[] args) throws InterruptedException {
        LaunchBrowser obj = new LaunchBrowser();
        obj.launchapplication();
    }

    public void launchapplication(){
      //  WebDriver driver = new WebDriver();
        WebDriver driver = new ChromeDriver();
        //maximize the browser window
        driver.manage().window().maximize();
        //launch the application
        driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public void launchBrowser() throws InterruptedException {
        /*
        //Before selenium 4.11.0 user need to set system property
        // Browser driver executable should be in the system PATH
        System.setProperty("webdriver.chrome.driver", "E:/chromedriver/cd140/chromedriver.exe");
      System.setProperty("webdriver.gecko.driver", "E:/geckodriver/geckodriver.exe");
      System.setProperty("webdriver.edge.driver", "E:/edgedriver/msedgedriver.exe");
        System.setProperty("webdriver.ie.driver", "E:/iedriver/IEDriverServer.exe");
         */
            //After selenium 4.11.0
        // WebDriver driver = new FirefoxDriver();
        //try launching edge browser
        //launch Chrome browser
        //below line will create a instance of Chrome browser everytime
        WebDriver driver = new ChromeDriver();
        //maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(2000); // Pause for 2 seconds to see the maximized window
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //close the browser
       // driver.close(); //use close if only one tab is opened
        driver.quit(); //use quit if multiple tabs are opened
    }


}
