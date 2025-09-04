package oopsConcepts.accessModifier;

public class Circle {
    public static void main(String[] args) {
        Shape shape = new Shape();
        //default  members are accessible within the same package
        shape.defaultMethod();
        shape.protectedMethod();
        shape.publicMethod();
    //     shape.privateMethod(); // This line would cause a compile-time error
    }
}
