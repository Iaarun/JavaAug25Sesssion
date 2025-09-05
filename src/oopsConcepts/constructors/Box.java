package oopsConcepts.constructors;

public class Box {
    double width;
    double height;
    double depth;
/*
 Three types of constructors:
    1. Default Constructor: A constructor that takes no parameters and initializes the object with default values and
      is provided by the compiler if no other constructors are defined
    2. Parameterized Constructor: A constructor that takes parameters to initialize the object with specific values
    3. No-Argument Con
    to allocate memory : Similar to the default constructor, but can include custom initialization logic
  usage of constructor:
  to initialize  the object
  to supply data to instance variables at the time of object creation
  to provide initial setup for the object
 */
    // No-Argument   Constructor
    //constuctor overloading
    // constructor chaining
    // this() keyword to call another constructor
    //constructor cannot be static, final, abstract or synchronized
    //private constructor is used in stoping the object creation from outside the class
    Box(){
        this(15,15,15);
        System.out.println("Login first   for Box creation");
    }

    // Parameterized Constructor
    Box(double width, double height, double depth){
 //      this();    // calling no-argument constructor
        this.displayFunction();
       this.width = width;
         this.height = height;
         this.depth = depth;
    }
    public static void main(String[] args) {
   //    Box box1 = new Box();
    //    box1.width = 10;
     //   box1.height = 20;
       // box1.depth = 30;
    //    double volume1 = box1.width * box1.height * box1.depth;
      //  System.out.println("Volume of Box 1: " + volume1);
        /*
        Box box2 = new Box(10, 20, 30);
        double volume2 = box2.width * box2.height * box2.depth;
        System.out.println("Volume of Box 2: " + volume2);
*/
        Box box3 = new Box();
        double volume3 = box3.width * box3.height * box3.depth;
        System.out.println("Volume of Box 3: " + volume3);
    }

    public void displayFunction(){
        System.out.println("This is display function");
    }
}
