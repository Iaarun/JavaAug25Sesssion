package testNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirefoxTests {

    @Parameters({"browser"})
    @Test
    public void firefoxTestMethod(String browser) {
        System.out.println("This is a Firefox test method.");
        System.out.println(Thread.currentThread().getId()+" Executing on browser: " + browser);
    }
}
