package testlearn;

import oopsConcepts.accessModifier.Shape;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!!");
//        System.out.println("Hello World!!");
//        System.out.println("Hello World!!");
//        System.out.println(_001Variable.course);

        _005Arrays ar = new _005Arrays();
        ar.multiDimensionalArray();  //function reusability

        Shape shape = new Shape();
      //  shape.defaultMethod();
        //shape.protectedMethod();
        shape.publicMethod();
        //shape.privateMethod(); // This line would cause a compile-time error

    }
}
