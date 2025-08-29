package testlearn;

public class _007LoopStatement {
    public static void main(String[] args) {
        _007LoopStatement lp = new _007LoopStatement();
        lp.sumofArray();
    }

    public void forloop(){
        /*
          for(initialization; condition; increment/decrement){
              //body
          }
         */
        for(int i=10; i>5;i--){
            System.out.println("Hello Arun");
        }
    }
    // take integer input and print table of that number
    // take the integer input from the user and print sum of n natural number
    // take the integer input from the user and print factorial of that number
    public void sumofArray(){
        int arr[] = {21,45,78,65,78,25};
        int sum=0;
        for(int i=0; i<=arr.length-1;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);

    }
}
