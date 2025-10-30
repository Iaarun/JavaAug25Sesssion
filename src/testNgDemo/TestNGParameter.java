package testNgDemo;

import org.testng.annotations.*;

public class TestNGParameter {

    @Parameters({"username", "password"})
    @Test
  public void testMethod(String username, String password){
      System.out.println("Username: "+username);
      System.out.println("Password: "+password);

  }




}
