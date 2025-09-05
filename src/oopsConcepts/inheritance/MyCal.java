package oopsConcepts.inheritance;

public class MyCal extends Calculation {
    public void multiplication(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
    public void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
