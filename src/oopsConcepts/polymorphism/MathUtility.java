package oopsConcepts.polymorphism;

public class MathUtility {
 // private members takes part in method overloading
    // static members takes part in method overloading
    // final members takes part in method overloading
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
/*
    //cannot achieve method overloading by changing return type only
    // Uncommenting the below method will cause a compilation error
    public double add(int a, int b) {
        return a + b;
    }

 */

    // Method to add three integers
    // method overloading by changing number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    // method overloading by changing data types of parameters
    public double add(double a, double b) {
        return a + b;
    }
    public double add(int a, double b) {
        return a + b;
    }
    // Method to add an integer and a double value
    // method overloading by changing order of parameters
    public double add(double a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method to multiply two double values
    public double multiply(double a, double b) {
        return a * b;
    }
  // can i overload main method? yes
  public static void main(String[] args) {

  }
    public static void main(int[] args) {

    }

}
