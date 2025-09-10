package oopsConcepts.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.sound(); // Inherited method from Animal class
        dog1.eat();   // Inherited method from Animal class

        Cat cat1 = new Cat();
        cat1.sound(); // Inherited method from Animal class
        cat1.eat();   // Inherited method from Animal class

        // Upcasting
        Animal animal1 = new Dog();
        animal1.sound(); // Dog's overridden method
        animal1.eat();   // Dog's overridden method

        //downcasting
         Dog dog2 = (Dog)new Animal();
            dog2.sound(); // Dog's overridden method
    }
}
