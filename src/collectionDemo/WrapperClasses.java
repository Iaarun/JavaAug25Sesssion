package collectionDemo;

public class WrapperClasses {

    public static void main(String[] args) {
        // Primitive types and their corresponding wrapper classes
        int primitiveInt = 10;
        Integer abc = primitiveInt; // Autoboxing
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing
        int unboxedInt = wrapperInt.intValue(); // Unboxing

        double primitiveDouble = 20.5;
        Double wrapperDouble = Double.valueOf(primitiveDouble); // Boxing
        double unboxedDouble = wrapperDouble.doubleValue(); // Unboxing

        char primitiveChar = 'A';
        Character wrapperChar = Character.valueOf(primitiveChar); // Boxing
        char unboxedChar = wrapperChar.charValue(); // Unboxing

        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = Boolean.valueOf(primitiveBoolean); // Boxing
        boolean unboxedBoolean = wrapperBoolean.booleanValue(); // Unboxing

        System.out.println("Primitive int: " + primitiveInt + ", Wrapper Integer: " + wrapperInt + ", Unboxed int: " + unboxedInt);
        System.out.println("Primitive double: " + primitiveDouble + ", Wrapper Double: " + wrapperDouble + ", Unboxed double: " + unboxedDouble);
        System.out.println("Primitive char: " + primitiveChar + ", Wrapper Character: " + wrapperChar + ", Unboxed char: " + unboxedChar);
        System.out.println("Primitive boolean: " + primitiveBoolean + ", Wrapper Boolean: " + wrapperBoolean + ", Unboxed boolean: " + unboxedBoolean);
    }
}
