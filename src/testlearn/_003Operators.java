package testlearn;

//operator overloading
public class _003Operators {
    public static void main(String[] args) {
        //         int a = 10;
//            int b = 20;
//            String ab="10";
//            String bc="20";
//        System.out.println(a+b);//30
//        System.out.println(ab+a);//1010
//        System.out.println(ab+bc);//1020
        _003Operators op = new _003Operators();
        op.ternaryOperator();

    }

    public void arithmeticOperators() {
        int a = 10;
        int b = 7;

        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 1
        System.out.println("Modulus: " + (a % b)); // 3
    }

    public void unaryOperators() {
        int a = 10;
        int b = 5;

        System.out.println("Unary Operators:");
        //    System.out.println("Unary Plus: " + (a++)); // 11
        //    System.out.println(a);
        //   System.out.println("Unary Minus: " + (-a)); // -10
        // System.out.println("Increment: " + (++a)); // 11
        //    System.out.println("Decrement: " + (b--));
        //    System.out.println(b);

        System.out.println(++a + --b);
    }

    public void relationalOperators() {
        int a = 10;
        int b = 20;

        System.out.println("Relational Operators:");
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // false
        System.out.println("Less than: " + (a < b)); // true
        System.out.println("Greater than or equal to: " + (a >= b)); // false
        System.out.println("Less than or equal to: " + (a <= b)); // true
    }

    public void logicalOperators() {
        boolean x = true;
        boolean y = false;


        System.out.println("Logical Operators:");
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false
    }

    public void ternaryOperator() {
        int a = 10;
        int b = 20;

        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Maximum value: " + max); // 20

        int score = 35;
        String result = (score >= 50) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}
