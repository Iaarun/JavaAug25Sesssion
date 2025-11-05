package testngretrylogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryAnnotation {

    @Test
    public void testFunction1(){
        System.out.println("TestNG Retry Logic Demo");
        Assert.assertTrue(true);
    }

    @Test
    public void testFunction2(){
        System.out.println("TestNG Retry Logic Demo function2");

        Assert.assertTrue(false);
    }

}
