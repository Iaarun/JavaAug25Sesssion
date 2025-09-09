package oopsConcepts.abstractiondemo;

public class TestInterface implements Interface1 {
    public static void main(String[] args) {
        Interface1.show();
    }
    @Override
    public void method1() {
        System.out.println("Method 1 from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 from Interface1");
    }

    @Override
    public void display() {
        Interface1.super.display();
    }


}
