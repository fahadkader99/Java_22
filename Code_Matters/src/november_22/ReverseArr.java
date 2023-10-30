package november_22;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {
    // take input from user & reverse the Array

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<arr.length; i++){
            System.out.println("Element " + (i+1));
            arr[i] = sc.nextInt();
        }

          System.out.println("\nAfter Reverse: ");
//        for (int i = 0; i < arr.length / 2 ; i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//
//        }

        // Easy way
        int temp = 0;
        int start = 0;
        int end = arr.length-1;

        while (start < end){

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
