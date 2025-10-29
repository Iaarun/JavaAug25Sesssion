package testNgDemo;

import org.testng.annotations.Test;


public class TestNgIgnore {


@Test
    public void testMethod(){
        System.out.println("This is a test method");
    }

@Test
    public void anotherTestMethod(){
        System.out.println("This is another test method");
    }

@Test
    public void testMethod2(){
        System.out.println("This is  method2");
    }
@Test
    public void testMethod3(){
        System.out.println("This is  method3");
    }

@Test
    public void testMethod4(){
        System.out.println("This is after method4");
    }


   @Test  (enabled = false)
    public void testMethod5(){
        System.out.println("This is after method5");
    }

    @Test(invocationCount = 0)
    public void testMethod6(){
        System.out.println("This is  method6");
    }


    @Test(timeOut = 4000)
    public void testMethod7() throws InterruptedException {
        System.out.println("This is  method7");
        Thread.sleep(3000);
    }

}
