package c_Bat.array1;

import java.util.Arrays;
import java.util.Scanner;

public class RotateLeft3 {
    /*
    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i <arr.length;i++){
            System.out.println("Enter element: "+ (i+1));
            arr[i] = sc.nextInt();
        }


        System.out.println("Before rotation: ");
        System.out.println(Arrays.toString(arr));



        int first = arr[0];
        for (int i = 1; i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;

        System.out.println("\nAfter left rotation: ");
        for (int array: arr ){
            System.out.print(array+" ");
        }


    }
}
