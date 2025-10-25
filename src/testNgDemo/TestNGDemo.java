package testNgDemo;

import org.testng.annotations.*;

public class TestNGDemo {

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This is after class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is after test");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("This is before groups");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("This is after groups");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This is after suite");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }
  @Test
    public void testFunction(){
        System.out.println("This is a test function");
    }

    @Test
    public void anotherTestFunction(){
        System.out.println("This is another test function");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is after method");
    }


}
