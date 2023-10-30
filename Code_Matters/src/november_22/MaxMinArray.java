package november_22;

import java.util.Scanner;

public class MaxMinArray {
    // find the max & min number from an array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i=0; i< arr.length; i++){
            System.out.println("enter element " +(i+1));
            arr[i] = sc.nextInt();
        }
        sc.close();

        int min = arr[0];
        int max = arr[0];

        for (int i=0; i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }



        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}
