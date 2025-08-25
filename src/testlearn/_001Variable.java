package testlearn;
/*type of variable
    * 1. local variable
    * 2. instance variable
    * 3. static variable/class variable
 */

public class _001Variable {
 String name = "Sachin"; // instance variable
    static String course="Java";

    public static void main(String[] args) {
       // variable declaration & initialization
        //creating object of class
        _001Variable obj1 = new _001Variable();
        _001Variable obj2 = new _001Variable();
        // calling instance variable
      //  System.out.println(obj.name);
     //   System.out.println(name);
 // calling static variable
       // System.out.println(course);
     //   System.out.println(_001Variable.course);

        obj1.name= "Arun";
        obj2.name= "Ravi";
        obj1.course = "Java";


        obj1.name = "Sachin";
        obj2.course = "Python  ";
        System.out.println(obj1.name); //Arun
        System.out.println(obj1.course); //Java
        System.out.println(obj2.name); //Ravi

        System.out.println(obj2.course); //Java

        //
    }

    public  void localVariable(){
        int   num = 10;
        String name = "Sachin";
        System.out.println(name);
    }
}

