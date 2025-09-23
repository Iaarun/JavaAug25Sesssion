package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class BasicSeleniumFunctions {
    WebDriver driver;

    public static void main(String[] args) {
        BasicSeleniumFunctions obj = new BasicSeleniumFunctions();
        obj.launchBrowser("chrome");
       // obj.launchApp("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       obj.browserNavigation();
    //    obj.closeBrowser();
    }

    public void launchBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please pass the correct browser: " + browser);
        }
        driver.manage().window().maximize();

    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void launchApp(String url){
        driver.get(url);
    }

    public void browserNavigation(){
        driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/");
        System.out.println("Current URL: "+driver.getCurrentUrl()); //bonigarcia
        driver.navigate().to("https://www.google.com/");
        System.out.println("Current URL: "+driver.getCurrentUrl()); //google
        driver.navigate().back();
        System.out.println("After back Current URL: "+driver.getCurrentUrl());//bonigarcia
        driver.navigate().forward();
        System.out.println("After forward Current URL: "+driver.getCurrentUrl());//google
        driver.navigate().refresh();
        System.out.println("After refresh Current URL: "+driver.getCurrentUrl());//google
    }
    public void basicFunctions(){
        //to launch the application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     // to get the url
      String url=  driver.getCurrentUrl();
        System.out.println("Current URL:  "+url);

        //get the title of the page
      String title=  driver.getTitle();
        System.out.println("Title of the page:  "+title);
        //get the page source
        String pagesource=  driver.getPageSource();
     //   System.out.println("Page source length:  "+pagesource);

      String tabId=  driver.getWindowHandle();
        System.out.println("Tab ID:  "+tabId);
        // to open a new tab
     //   driver.switchTo().newWindow(WindowType.TAB);
       // driver.get("https://www.google.com");

      Set<String> tabIds= driver.getWindowHandles();
        System.out.println(tabIds);



   }
}
