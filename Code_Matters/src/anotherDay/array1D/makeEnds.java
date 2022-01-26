package anotherDay.array1D;

import java.util.Arrays;
import java.util.Scanner;

public class makeEnds {
    /*
    Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
    The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i <arr.length;i++){                 // this loop is taking input
            System.out.println("Enter element: "+ (i+1));
            arr[i] = sc.nextInt();
        }

        int []n  = new int[2];

        if(arr.length>=1){
            n[0]=arr[0];
            n[1]=arr[arr.length-1];
        }

        System.out.println(Arrays.toString(n));



    }


}
