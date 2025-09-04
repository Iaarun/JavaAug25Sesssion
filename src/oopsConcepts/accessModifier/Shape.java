package oopsConcepts.accessModifier;

public  class Shape {

 private   String name;
 String color;
 protected int sides;
 public double area;

    public static void main(String[] args) {
         Shape shape = new Shape();
            shape.privateMethod();
            shape.protectedMethod();
            shape.defaultMethod();
            shape.publicMethod();

    }
// private member can be accessed only within the same class
 private void privateMethod() {
     System.out.println("This is a private method.");
 }
// protected member can be accessed within the same package and subclasses
    // if there is inheritance between classes
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // public member can be accessed from any other class throughout the project
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
    // default member can be accessed only within the same package
    void defaultMethod() {
        System.out.println("This is a default method.");
    }


}
