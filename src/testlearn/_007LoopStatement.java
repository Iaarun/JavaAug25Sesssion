package testlearn;

import java.util.Scanner;

public class _007LoopStatement {
    public static void main(String[] args) {
        _007LoopStatement lp = new _007LoopStatement();
        lp.iterateString();
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
    public void factorial(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int fact =1;
        for(int i =1; i<=num; i++){
             fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }

    //find the maximum number in an array
    public void maxInArray(){
        int arr[] = {21,45,80,65,78,25};
        int max = arr[0];
        for (int i=1; i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }

    //write a program to find second maximum number in an array
    //nested for loop when user need to iterate on 2D array
    // upper for loop is for rows and inner for loop is for columns

    public void nestedForLoop(){
        int arr[][] = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120}
        };

        System.out.println(arr.length);// number of rows
        System.out.println(arr[0].length);// number of columns

        for(int i=0; i<=arr.length-1;i++){
            for(int j=0; j<=arr[0].length-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
  /*
     initialization: int i=1
     while(condition): i<=10{
            //body
            increment/decrement: i++
        }
   */
 public void sumofArrayUsingWhile(){
     int arr[] = {21,45,78,65,78,25};
     int sum =0;
     int i=0;
     while(i<=arr.length-1){
         sum = sum+arr[i];
         i++;
     }
        System.out.println(sum);
 }
   public void iterateString(){
     String abc ="This is a test data used for research";
     for (int i=0; i<=abc.length()-1;i++){
         System.out.print(abc.charAt(i)+" ");
     }
       System.out.println();
    String[] arr=  abc.split(" ");
     for(int i=0; i<=arr.length-1;i++){
         System.out.print(arr[i]+"    ");
     }
   }
}
