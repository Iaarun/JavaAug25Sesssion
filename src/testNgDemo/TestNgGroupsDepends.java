package testNgDemo;

import org.testng.annotations.Test;


public class TestNgGroupsDepends {


@Test (groups = {"smoke"}, timeOut = 2000)
    public void testMethod() throws InterruptedException {
        System.out.println("This is a test method");
        Thread.sleep(4000);
    }

@Test (groups = {"regression"})
    public void anotherTestMethod(){
        System.out.println("This is another test method");
    }

@Test   (groups = {"smoke"}, dependsOnMethods = {"testMethod"})
    public void testMethod2(){
        System.out.println("This is  method2");
    }

@Test (groups = {"regression"})
    public void testMethod3(){
        System.out.println("This is  method3");
    }

@Test  (groups = {"regression"})
    public void testMethod4(){
        System.out.println("This is  method4");
    }


   @Test (groups = {"smoke", "regression"})
    public void testMethod5(){
        System.out.println("This is  method5");
    }

    @Test (groups = {"smoke"})
    public void testMethod6(){
        System.out.println("This is  method6");
    }


    @Test (groups = {"regression"})
    public void testMethod7() throws InterruptedException {
        System.out.println("This is  method7");
    }

}
