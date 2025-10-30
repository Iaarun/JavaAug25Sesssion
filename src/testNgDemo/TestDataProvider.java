package testNgDemo;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    //returning two dimensional object array
    @DataProvider(name = "logindata")
    public Object[][] testData(){
        Object[][] data = new Object[3][2];

        //1st row
        data[0][0] = "user1";
        data[0][1] = "pass1";
        //2nd row
        data[1][0] = "user2";
        data[1][1] = "pass2";
        //3rd row
        data[2][0] = "user3";
        data[2][1] = "pass3";

        return data;
    }
}
