package anotherDay.array1D;

import java.util.Arrays;
import java.util.Scanner;

public class ArrReverse {
    /*
    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
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


        System.out.println("Before Reverse: ");
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }




    }
}
