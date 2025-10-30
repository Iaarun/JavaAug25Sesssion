package testNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter1 {

    @Parameters({"username", "password"})
    @Test
  public void testMethod(String username, String password){
      System.out.println("Username: "+username);
      System.out.println("Password: "+password);

  }




}
