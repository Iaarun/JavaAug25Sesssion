package testNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
  Assert/HardAssert
  SoftAssert

    Difference between Assert and SoftAssert or Assert and Verify
 */
public class TestNgAssertions {

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

    @Test (enabled = false)
    public void verifyTitleofThepage(){

        String expectedhomePageTitle="Home page123";
        WebDriver driver = new ChromeDriver();
        driver.get("https://live.techpanda.org/index.php/");
        driver.manage().window().maximize();
      String actualHomePageTitle=  driver.getTitle();

      Assert.assertEquals(actualHomePageTitle, expectedhomePageTitle, "Home Page title is not matching");

      driver.quit();
    }

    @Test
    public void verifyTitleofThepageSofAssert(){
      SoftAssert softAssert = new SoftAssert();
        String expectedhomePageTitle="Home page123";
        WebDriver driver = new ChromeDriver();
        driver.get("https://live.techpanda.org/index.php/");
        driver.manage().window().maximize();
        String actualHomePageTitle=  driver.getTitle();

        softAssert.assertEquals(actualHomePageTitle, expectedhomePageTitle, "Home Page title is not matching");
        driver.quit();

        softAssert.assertAll();
    }
}
