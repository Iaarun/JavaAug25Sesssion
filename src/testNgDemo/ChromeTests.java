package testNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChromeTests {

    @Parameters({"browser"})
    @Test
    public void chromeTestMethod(String browser) {
        System.out.println("This is a Chrome test method.");
        System.out.println(Thread.currentThread().getId()+" Executing on browser: " + browser);
    }
}
