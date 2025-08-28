package testlearn;

import java.util.Scanner;

public class _005UserInput {
    public static void main(String[] args) {
        _005UserInput ui = new _005UserInput();
        ui.userInput();
    }
    public void userInput(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
         String name = in.next();
        System.out.println("Hello My name is "+ name);

        System.out.println("Enter your age: ");
        int age = in.nextInt();
        System.out.println("My age is "+ age);

        System.out.println("Enter your cgpa: ");
        float cgpa = in.nextFloat();
        System.out.println("My cgpa is "+ cgpa);

        char ch = in.next().charAt(0);
        System.out.println("My first name starts with "+ ch);

   //take two integer input from the user and perform all arithmetic operation

    }

}
