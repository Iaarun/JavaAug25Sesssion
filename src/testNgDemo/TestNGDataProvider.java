package testNgDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDataProvider {



    @Test (dataProvider = "logindata", dataProviderClass = TestDataProvider.class)
  public void testMethod(String username, String password){
      System.out.println("Username: "+username);
      System.out.println("Password: "+password);
  }

}
