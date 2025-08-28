package testlearn;

public class _006ConditionalStatements {
    public static void main(String[] args) {
        _006ConditionalStatements cs = new _006ConditionalStatements();
        cs.nestedIfstatement();
    }

    public void ifstatement(){
        int age = 17;
        if (age>=18) {
            System.out.println("You are eligible to vote");
        }

    }

    public void ifElsestatement(){
        int age = 19;
        if (age>=18) {
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }

    public void nestedIfstatement(){
        int age = 15;
        boolean hasVoterIdCard = false;

        if (age>=18) {
            System.out.println("Do you have a voter ID card?");
               if(hasVoterIdCard){
                   System.out.println("You are eligible to vote");
               } else {
                   System.out.println("You need a voter ID card to vote");
               }
        }else{
            System.out.println("Underage are not eligible to vote");
        }
    }
}
