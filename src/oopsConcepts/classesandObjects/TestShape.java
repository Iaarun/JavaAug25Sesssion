package oopsConcepts.classesandObjects;

import oopsConcepts.accessModifier.Shape;

public class TestShape extends  Shape {
    public static void main(String[] args) {
        TestShape testShape = new TestShape();
        testShape.protectedMethod(); // Accessible because TestShape inherits from Shape
        testShape.publicMethod(); // Accessible because it's public
      //  testShape.defaultMethod(); // Accessible because TestShape is in the same package

        //protected member are accessible only through inheritance
    }
}
