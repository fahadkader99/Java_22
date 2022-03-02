package Challenging_Problem_1;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumInArray {
    /*
    You are given a list of n-1 integers and these integers are in the range of 1 to n.
    There are no duplicates in the list.
    One of the integers is missing in the list.
    Write an efficient code to find the missing integer.

    Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
    Output: 5
    Explanation: The missing number from 1 to 8 is 5

    Input: arr[] = {1, 2, 3, 5}
    Output: 4
    Explanation: The missing number from 1 to 5 is 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array # ");
        int size = sc.nextInt();

        int[]arr= new int[size];
        for (int i=0; i< arr.length;i++){
            System.out.println("Enter element "+(i+1));
            arr[i]=sc.nextInt();
        }

        int n = arr.length+1;       // since we are missing one number so length will be +1

        int sum = (n*(n+1))/2;      //we need to find the sum of n number

        for (int i = 0; i < arr.length; i++){
            sum = sum-arr[i];
        }

        System.out.println("Missing num: "+ sum);


        easyWay();      // the easiest way but not faster.

    }


    public static void easyWay(){
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
