package testlearn;

import java.util.Arrays;
import java.util.Collections;

public class _005Arrays {
    public static void main(String[] args) {
        _005Arrays arr = new _005Arrays();
        arr.multiDimensionalArray();
    }

    public void arrayDeclaration(){
        //array declaration  and initialization
        int[] arr = new int [5];
        int arr1[];

        arr[0]=15;
        arr[4]=35; //array index starts from 0 to n-1  ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(arr));
        arr[0]=25;
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int [10];

    }

    public void arrayFunctions(){
        Integer arr[] = {10,31,68,22,8};
        int arr1[] = new int []{10,20,30,40,50};
        System.out.println(arr[2]);

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }

    public void multiDimensionalArray(){
        //first bracket is row and second is column
        int arr[][] = new int[3][4];
        System.out.println(arr.length);
        System.out.println(arr[0][0]);
         arr[0][0]=326;
         arr[0][1]=565;
            arr[0][2]=123;
            arr[0][3]=789;
            arr[1][0]=456;
            arr[1][1]=852;
            arr[1][2]=741;
            arr[1][3]=963;
            arr[2][0]=159;
            arr[2][1]=357;
            arr[2][2]=258;
            arr[2][3]=147;
        System.out.println(Arrays.deepToString(arr));







    }
}
