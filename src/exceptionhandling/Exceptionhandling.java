package exceptionhandling;

import java.io.*;
import java.util.Scanner;

public class Exceptionhandling {
    public static void main(String[] args) throws AgeException {
        Exceptionhandling obj = new Exceptionhandling();
        obj.checkVoterAge();
    }

    public void checkedexceptiondemo() {
        File file = new File("/test/test.txt");
        //      FileInputStream fis = new FileInputStream(file); //checked exception compile time exception
    }

    public void exceptiondemo() {
        System.out.println("Start of the program");
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println("Result: " + c);
        System.out.println("End of the program");
        //runtime exception unchecked exception

    }

    // use try catch block to handle exception
    public void trycatchdemo() {
        System.out.println("Start of the program");
        int a = 10;
        int b = 0;
        int d;
        try {
            //code that may throw exception
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            //code to handle the exception
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This block is always executed");
        }
    }

    public void compiletypeexceptiondemo() throws FileNotFoundException, IOException {

        //throws keyword used to handle multiple checked exceptions
        File file = new File("src/exceptionhandling/test.txt");
        FileInputStream fis = null;

        fis = new FileInputStream(file);

        //checked exception compile time exception
        FileOutputStream fos = null;
        fos = new FileOutputStream(file);
        fos.close();
    }

    public void checkVoterAge() throws AgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        CheckMyAge obj = new CheckMyAge();
        /*
        try{
            obj.checkAge(age);
        }catch (AgeException e){
            e.printStackTrace();
    }
         */
        //or
        //throws keyword used to propagate the exception to the caller method
        //   obj.checkAge(age);
        //try catch and finally block
        try {
            obj.checkAge(age);
        }

        catch (AgeException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("This block is always executed");
        }
    }
}
