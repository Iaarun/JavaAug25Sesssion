package testlearn;

public class _002DataTypes {

    public static void main(String[] args) {
        _002DataTypes dt = new _002DataTypes();
        dt.nonPrimitiveDataType();
    }


    public void primitiveDataType(){
        // Primitive Data Types
        // 1. byte: 8-bit signed integer
        byte b = 100; // -128 to 127

        // 2. short: 16-bit signed integer
        short s = 10000; // -32,768 to 32,767

        // 3. int: 32-bit signed integer
        int i = 100000; // -2^31 to 2^31-1

        // 4. long: 64-bit signed integer
        long l = 100000L; // -2^63 to 2^63-1

        long lg = 14946164961961949L;

        // 5. float: single-precision 32-bit IEEE 754 floating point
        float f = 10.5f; // Suffix 'f' indicates a float literal
        float ab = 564.2323f;

        // 6. double: double-precision 64-bit IEEE 754 floating point
        double d = 20.5; // Default type for decimal numbers is double

        // 7. char: single 16-bit Unicode character
        char c = 'A'; // Single character enclosed in single quotes

        // 8. boolean: true or false
        boolean bool = true; // Can be true or false

        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }

    public void typeCasting(){
        //implicit Type Casting (Widening)
        int i = 100841855;
        long l = i; // int to long

        System.out.println("int value: " + i +"\nlong value: " + l);

        //Explicit Type Casting (Narrowing)
        double d = 100.04;
        int j = (int) d; // double to int
        System.out.println("double value: " + d + "\nint value: " + j);

        long lg = 1494616496196194955L;
        byte by = (byte) lg;
        System.out.println("long value: " + lg + "\nbyte value: " + by);

    }

    public void nonPrimitiveDataType(){
        // Non-Primitive Data Types
       //using  literals
        String str1="Hello World";
        System.out.println(str1);

        //using new keyword
        String str2 = new String("Hello Arun");
        System.out.println(str2);
    }

}
