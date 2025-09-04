package oopsConcepts.classesandObjects;

public class Dog {
    // attributes/ properties
    String name;
    String breed;
    int age;
    String color;

    public static void main(String[] args) {
        Dog dog1 = new Dog(); //(new Dog(); instance of Dog class)
        // (dog1 is reference variable)
        dog1.name = "Buddy";
        dog1.breed = "Golden Retriever";
        dog1.age = 3;
        dog1.color = "Golden";

        dog1.barking();
        dog1.eatinghabit();
        dog1.getName();
        dog1.getAge();

        Dog dog2 = new Dog();
        dog2.name = "Max";
        dog2.breed = "German Shepherd";
        dog2.age = 4;
        dog2.color = "Black and Tan";
        dog2.barking();
        dog2.eatinghabit();
        dog2.getName();
        dog2.getAge();
        dog2.sleep(dog2.name); // passing arguments to method


    }
    // behavior/ methods
    public void barking() {
        System.out.println(name + " is barking");
    }

    public void eatinghabit() {
        System.out.println(name + " is eating");
    }

    public void getName() {
        System.out.println("Dog name is: " + name);
    }

    //non-parameterized method
    public void getAge() {
        System.out.println(name + " is " + age + " years old");
    }

    //parameterized method
    public void sleep(String name) {
        System.out.println( name+ " is sleeping");
    }
    static      void testMethod(){
        System.out.println("This is a test method");
    }
}
