package seleniumdemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BasicSeleniumFunctions {
    WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        BasicSeleniumFunctions obj = new BasicSeleniumFunctions();
        obj.launchBrowser("chrome");
       // obj.launchApp("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       obj.handleCalender();
     //   obj.closeBrowser();
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

    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }


    public void launchApp(String url){
        driver.get(url);
    }

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
    public void handleWebTable(){
                driver.get("https://www.moneycontrol.com/markets/indian-indices/");
           List<WebElement> head=     driver.findElements(By.xpath("//table[@id='indicesTable']/thead/tr/th"));
          int noOfCol=     head.size();
        System.out.println("Number of columns: "+noOfCol);
       List<WebElement> tbody=   driver.findElements(By.xpath("//table[@id='indicesTable']/tbody/tr"));
      int noOfRows=   tbody.size();
        System.out.println("Number of rows: "+noOfRows);
       //Print all header
        for(int i=1;i<=noOfCol; i++){
        String headerName=    driver.findElement(By.xpath("//table[@id='indicesTable']/thead/tr[1]/th["+i+"]")).getText();
            System.out.print(headerName+" | ");
        }
        System.out.println();
        System.out.println("===================================");
        //completedata of the table outer loop for rows and inner loop for columns
         for( int i=1; i<=noOfRows; i++){
             for(int j=1; j<=noOfCol-2; j++){
              String cellData=   driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
                    System.out.print(cellData+" | ");
             }
             System.out.println();
         }

    }
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

    public void scroll(){
        driver.get("http://www.tizag.com/javascriptT/javascript-innerHTML.php");
        driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(10));
        //randomly scroll down the page
        JavascriptExecutor js= (JavascriptExecutor) driver;  //casting driver into JavascriptExecutor
   //    js.executeScript("window.scrollBy(0,1000)");

        //to scroll till the element is visible on the page
 //    WebElement airport=   driver.findElement(By.id("userInput"));
 // js.executeScript("arguments[0].scrollIntoView();",airport);

        //scroll to the bottom of the page
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
    public void handleMutipleWindows() throws InterruptedException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
     String tabid=   driver.getWindowHandle();
        System.out.println(tabid);
    //    driver.switchTo().newWindow(WindowType.TAB);
      WebElement webbtn=  driver.findElement(By.xpath("//a[normalize-space()='Web form']"));
      Actions action = new Actions(driver);
      Thread.sleep(2000);
        action.keyDown(Keys.CONTROL).click(webbtn).keyUp(Keys.CONTROL).build().perform();
        Set<String> allids=  driver.getWindowHandles();// implemts linked hashset
        System.out.println(allids);
        for(String id:allids){
            if(!id.equals(tabid)){
                driver.switchTo().window(id);
                System.out.println(driver.getCurrentUrl());
                driver.findElement(By.id("my-text-id")).sendKeys("Hello Selenium");
            }
        }
        driver.switchTo().window(tabid);
        System.out.println(driver.getCurrentUrl());

/*        //When there more than 2 tabs we will use iterator
        Iterator<String> it=  allids.iterator();
           it.next(); // gives you id of first tab
           it.next(); // gives you id of second tab
       String thirdtab= it.next();
       driver.switchTo().window(thirdtab);

 */
    }
    public void handleAlert() throws InterruptedException {
        /*
           information alert
            confirmation alert
             prompt alert
         */
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
        driver.findElement(By.id("my-alert")).click();
        Thread.sleep(2000);
        //NosuchAlertPresentException
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //confirmation alert
        driver.findElement(By.id("my-confirm")).click();
        Thread.sleep(2000);
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();

        //prompt alert
        driver.findElement(By.id("my-prompt")).click();
        Thread.sleep(2000);
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello Selenium");
        alert.accept();
    }


     public void fileUploadUsingRobotClass() throws AWTException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
      WebElement fileupload=   driver.findElement(By.name("my-file"));
      Actions action  = new Actions(driver);
      action.moveToElement(fileupload).click().build().perform();

      Robot robot = new Robot();

      String filePath="C:\\Users\\ACER\\Documents\\TestFileUpload\\SampleTextFile.txt";
      StringSelection stringSelection = new StringSelection(filePath);
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
      robot.delay(1000);
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);

      robot.keyRelease(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
     }
     public void fileUploadusingSendKeys(){
        String filePath="C:\\Users\\ACER\\Documents\\TestFileUpload\\SampleTextFile.txt";
         driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        driver.findElement(By.name("my-file")).sendKeys(filePath);
     }
    public void sendDataUsingActionsClass(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        WebElement userNameField= driver.findElement(By.id("my-text-id"));
        System.out.println(userNameField.isDisplayed());
        //action class is used to perform mouse and keyboard actions
        Actions action = new Actions(driver);
        //sendkeys to enter data in the input field
        //action.moveToElement(userNameField).click().sendKeys("Hello Selenium using Actions class").build().perform();
      //action.moveToElement(userNameField).doubleClick().sendKeys("hello").build().perform();
        action.moveToElement(userNameField).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").keyUp(Keys.LEFT_SHIFT).build().perform();
    }
public void handleSlider(){
        driver.get("https://jqueryui.com/slider/");
    //switch to frame
   WebElement demoframe=   driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
   driver.switchTo().frame(demoframe);
   WebElement slider=   driver.findElement(By.xpath("//div[@id='slider']/span"));
   //action class is used to perform mouse and keyboard actions
    Actions action = new Actions(driver);
    //move the slider by 200 pixels to right
    action.dragAndDropBy(slider,200,0).perform();
    //move the slider by 100 pixels to left
 //   action.dragAndDropBy(slider,-100,0).perform();
}
 public void dragandDrop(){
        driver.get("https://jqueryui.com/droppable/");
        //switch to frame
     WebElement demoframe=   driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
     driver.switchTo().frame(demoframe);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        //action class is used to perform mouse and keyboard actions
       Actions action = new Actions(driver);

    //   action.clickAndHold(source).moveToElement(target).release().build().perform();
   action.dragAndDrop(source,target).perform();
 //    action.dragAndDropBy(source,1000,0).release().build().perform();

 }
    public void handlingFrames(){
           driver.get("https://jqueryui.com/button/");
        // switch to frame by index
    //    driver.switchTo().frame(0);
        //locating frame using xpath
     WebElement demoframe=   driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(demoframe);
        WebElement button=   driver.findElement(By.xpath("//div[@class='widget']//button[contains(text(),'A button element')]"));
        System.out.println(button.isDisplayed());
        //switch back to main page from frame
        driver.switchTo().defaultContent();
      WebElement img=  driver.findElement(By.xpath("//a[@href='/']"));
        System.out.println(img.isDisplayed());


    }
    public void handleDataList(){
        driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");

    WebElement datalist=    driver.findElement(By.name("my-datalist"));
    datalist.sendKeys("TestData");
    datalist.clear();
    datalist.click();

   List<WebElement>options=  driver.findElements(By.xpath("//datalist[@id='my-options']/option"));
     //getAttribute returns the value of an attribute
        for (WebElement option : options) {
            System.out.println(option.getAttribute("value"));
        }

    }

    public void handleDropDown() throws InterruptedException {
        driver.navigate().to("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
     WebElement dropdown=   driver.findElement(By.name("my-select"));
     //use select class to handle dropdown
        Select select = new Select(dropdown);
        // default selected value
    WebElement firstselected=   select.getFirstSelectedOption();
    //getText method will fetch the text of the element
        System.out.println(firstselected.getText());
// options available in dropdown
        System.out.println("===options available in dropdown===");
      List<WebElement> alloption=  select.getOptions();
      // iter shortcut to implement foreach loop
      for(WebElement option: alloption){
          System.out.println(option.getText());
      }
            select.selectByVisibleText("Two");
      Thread.sleep(2000);
      select.selectByValue("3");
        Thread.sleep(2000);
      select.selectByIndex(0);



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
