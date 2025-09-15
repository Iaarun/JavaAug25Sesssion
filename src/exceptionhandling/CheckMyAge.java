package exceptionhandling;

public class CheckMyAge {

    public void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age is less than 18. Not eligible to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }
}
