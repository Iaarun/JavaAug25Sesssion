package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Exceptionhandling {
    public static void main(String[] args) {
        Exceptionhandling obj = new Exceptionhandling();
        obj.trycatchdemo();
    }
    public void checkedexceptiondemo(){
        File file = new File("/test/test.txt");
  //      FileInputStream fis = new FileInputStream(file); //checked exception compile time exception
    }
    public void exceptiondemo(){
        System.out.println("Start of the program");
        int a=10;
        int b=0;
        int c = a/b;
        System.out.println("Result: " + c);
        System.out.println("End of the program");
        //runtime exception unchecked exception

    }

    // use try catch block to handle exception
    public void trycatchdemo(){
        System.out.println("Start of the program");
        int a=10;
        int b=10;
        int d;
        try {
            //code that may throw exception
            int c = a/b;
            System.out.println("Result: " + c);
        }catch (Exception e){
            //executed when exception occurs
             e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}
