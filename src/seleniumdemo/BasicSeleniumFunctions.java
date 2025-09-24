package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class BasicSeleniumFunctions {
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        BasicSeleniumFunctions obj = new BasicSeleniumFunctions();
        obj.launchBrowser("chrome");
       // obj.launchApp("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       obj.selectMultipleCheckBox();
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

    public void selectMultipleCheckBox(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
     List<WebElement> boxes= driver.findElements(By.name("my-check"));
        System.out.println("Number of check boxes: "+boxes.size());
     boxes.forEach(box->{
         if(!box.isSelected()){
             box.click();
         }
     });

    }

    public void handleCheckBoxAndRadioButton() throws InterruptedException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
     WebElement check1=   driver.findElement(By.id("my-check-1"));
     // isSelected method will return true if the element is selected otherwise false
        System.out.println(check1.isSelected());
        Thread.sleep(2000);
        check1.click();
        System.out.println(check1.isSelected());
  // Write the code to handle radio button
    }
   public void sendDataToInputField(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
   WebElement userNameField= driver.findElement(By.id("my-text-id"));
   System.out.println(userNameField.isDisplayed());
   //sendkeys to enter data in the input field
       userNameField.sendKeys("Hello Selenium");
     WebElement password=  driver.findElement(By.name("my-password"));
        password.sendKeys("Selenium123");

        WebElement disableLement= driver.findElement(By.name("my-disabled"));
        // isEnabled method will return true if the element is enabled otherwise false
       System.out.println(disableLement.isEnabled());
      //  disableLement.sendKeys("test");
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
