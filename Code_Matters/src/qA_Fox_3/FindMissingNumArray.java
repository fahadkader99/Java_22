package qA_Fox_3;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumArray {
    // find the missing number in the array
        // pre-requisite: array can't have any duplicate number and do not have to sorted but numbers have to be in proper range.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");

        int [] arr = new int[sc.nextInt()];

        System.out.println("Enter elements");
        for (int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // =========================================

        int sum1 = 0;

        for (int i = 0; i<arr.length;i++){
            sum1 = sum1+arr[i];
        }

        System.out.println("\nSum of array elements : "+ sum1);

         int sum2 = 0;
         int first = arr[0];
         int last = arr[arr.length-1];

         for (int i = first; i<=last;i++){
             sum2 = sum2+ i;
         }
        System.out.println("Sum of the range: "+ sum2);

        System.out.println("\nMissing num is Array: "+ (sum2-sum1));





    }

}
