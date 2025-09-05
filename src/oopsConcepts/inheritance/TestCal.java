package oopsConcepts.inheritance;

public class TestCal {
    public static void main(String[] args) {

      /*  Square square = new Square();
       square.side1=10;
       square.area();

       Rectangle rectangle = new Rectangle();
       rectangle.side1=10;
         rectangle.area();*/

        MyCal myCal = new MyCal();
        myCal.multiplication(10, 20);
        myCal.division(10, 2);
        myCal.addition(10, 20);
        myCal.subtraction(10, 20);
    }
}
