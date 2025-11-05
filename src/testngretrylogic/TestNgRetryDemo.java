package testngretrylogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryDemo {

    @Test (retryAnalyzer = RetryAnalyzer.class)
    public void testFunction1(){
        System.out.println("TestNG Retry Logic Demo");
        Assert.assertTrue(false);
    }

    @Test
    public void testFunction2(){
        System.out.println("TestNG Retry Logic Demo function2");
        Assert.assertTrue(true);
    }

}
