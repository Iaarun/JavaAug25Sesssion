package oopsConcepts.abstractiondemo;

public interface Interface1 {
    void method1();
    void method2();

    default void display(){
        System.out.println("This is a default method in Interface1");
    }

    static void show(){
        System.out.println("This is a static method in Interface1");
    }
}
