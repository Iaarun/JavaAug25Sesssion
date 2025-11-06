package testNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
  Assert/HardAssert
  SoftAssert

    Difference between Assert and SoftAssert or Assert and Verify
 */
@Listeners(testngretrylogic.TestListeners.class)
public class TestNgAssertions {
    WebDriver driver;
    @Test (enabled = false)
    public void testMethod(){
        System.out.println("Test Method Started");
        Assert.assertTrue(false);
        System.out.println("Test Method Ended");
    }

    @Test (enabled = false)
    public void testSoftAsssert(){
        System.out.println("Test Soft Assert Method Started");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        System.out.println("Test Soft Assert Method Ended");
        softAssert.assertAll();
    }

    @Test
    public void verifyTitleofThepage(){
        String expectedhomePageTitle="Home page123";
      String actualHomePageTitle=  driver.getTitle();
      Assert.assertEquals(actualHomePageTitle, expectedhomePageTitle, "Home Page title is not matching");

      driver.quit();
    }

    @Test
    public void verifyTitleofThepageSoftAssert(){
      SoftAssert softAssert = new SoftAssert();
        String expectedhomePageTitle="Home page";
        String actualHomePageTitle=  driver.getTitle();
        softAssert.assertEquals(actualHomePageTitle, expectedhomePageTitle, "Home Page title is not matching");
        softAssert.assertAll();
    }

    @BeforeMethod
    public void launchBrowser(){
      driver = new ChromeDriver();
        driver.get("https://live.techpanda.org/index.php/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser(){
      if(driver!=null){
          driver.quit();
      }
    }
}
