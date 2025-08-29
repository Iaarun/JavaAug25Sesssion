package testlearn;

import java.util.Scanner;

public class _006ConditionalStatements {
    public static void main(String[] args) {
        _006ConditionalStatements cs = new _006ConditionalStatements();
        cs.switchCase();
    }

    public void ifstatement() {
        int age = 17;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

        System.out.println("out of if block");

    }

    public void ifElsestatement() {
        int age = 19;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        System.out.println("out of if block");
    }

    public void nestedIfstatement() {
        int age = 15;
        boolean hasVoterIdCard = false;

        if (age >= 18) {
            System.out.println("Do you have a voter ID card?");
            if (hasVoterIdCard) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You need a voter ID card to vote");
            }
        } else {
            System.out.println("Underage are not eligible to vote");
        }

        System.out.println("out of if block");
    }

    public void ladderIfstatement() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = in.nextInt();

        if (marks <= 100 && marks >= 90) {
            System.out.println("A+ grade");
        } else if (marks < 90 && marks >= 80) {
            System.out.println("A grade");
        } else if (marks < 80 && marks >= 70) {
            System.out.println("B+ grade");
        } else if (marks < 70 && marks >= 60) {
            System.out.println("B grade");
        } else if (marks < 60 && marks >= 50) {
            System.out.println("C grade");
        } else if (marks < 50 && marks >= 40) {
            System.out.println("D grade");
        } else if (marks < 40 && marks >= 0) {
            System.out.println("Fail");
        }
    }

    public void switchCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check traffic signal color: ");
        String signal = scanner.next().toLowerCase();
        switch (signal) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
    }
    // take two integer input from the user and ask which operation wants to perform and then
    //perform that operation using switch case
}
