package testNgDemo;

import org.testng.annotations.Test;

public class TestNgBasic {

    @Test (priority = 1)
    public void testMethod(){
        System.out.println("This is a test method");
    }

    @Test (priority = 3)
    public void anotherTestMethod(){
        System.out.println("This is another test method");
    }

    @Test (priority = 2)
    public void testMethod2(){
        System.out.println("This is  method2");
    }
    @Test (priority = -1)
    public void testMethod3(){
        System.out.println("This is  method3");
    }

    @Test
    public void testMethod4(){
        System.out.println("This is after method4");
    }

    @Test
    public void testMethod5(){
        System.out.println("This is after method5");
    }




}
