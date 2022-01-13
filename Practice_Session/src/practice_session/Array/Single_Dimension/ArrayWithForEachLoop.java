package practice_session.Array.Single_Dimension;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayWithForEachLoop {
    public static void main(String[] args) {

        int[] arr = new int[5];

       arr[0]= 5;
       arr[1]= 5;
       arr[2]= 4;
       arr[3]= 5;
       arr[4]= 7;

        System.out.println(Arrays.toString(arr));

        for (int x : arr){
            System.out.print(x + ",");
        }
        System.out.println(" ");

        int sum = 0;
        for (int x : arr){
            sum = sum + x;
        }
        System.out.println("The sum of numbers in " + Arrays.toString(arr) + " is " + sum);

        int sumWithRegForLoop = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 ==0){
                sumWithRegForLoop = sumWithRegForLoop + arr[i];
            }
        }
        System.out.println("The sum of elements at even indices: " + sumWithRegForLoop);



    }
}
