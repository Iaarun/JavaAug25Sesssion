package oopsConcepts.constructors;

public class Test {
    static  int num;
  static {
      num=200;
        System.out.println("Static block called");
  }
     Test(){
            System.out.println("Test Constructor called");
     }
    public static void main(String[] args) {
   //     Test test = new Test();
    //    test.testFunction();
       // num=100;
        System.out.println("Value of num: "+num);
    }

    public void testFunction(){
        System.out.println("Test function");
    }
}
