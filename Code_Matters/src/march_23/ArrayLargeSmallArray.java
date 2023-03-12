package march_23;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargeSmallArray {
    // find the largest, second largest, smallest, second smallest element in the array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        ArrayLargeSmallArray a = new ArrayLargeSmallArray();
        a.largest(arr);
        a.smallest(arr);
        a.largeSmall(arr);


    }

    void largest(int[] arr){
        int max = arr[0];
        int secondMax = arr[0];
        Arrays.sort(arr);

        if (arr.length >=2){
            for (int i = 0; i<arr.length; i++){
                if (arr[i] > max){
                    max = arr[i];
                    secondMax = arr[i-1];
                }
            }
            System.out.println("\nMax: " + max);
            System.out.println("Second max: " + secondMax);
        }else {
            System.out.println("Max: " + Arrays.toString(arr));
        }

    }

    void smallest(int [] arr){
        int smallest = arr[0];                              //Integer.MAX_VALUE;
        int secondSmallest;        //arr[1]

        Arrays.sort(arr);

        if (arr.length>=2){
            secondSmallest = arr[1];
            for (int i = 0; i < arr.length; i++){
                if (arr[i] < smallest){
                    smallest = arr[i];
                    secondSmallest = arr[i+1];
                }
            }
            System.out.println("\nSmall: " +smallest);
            System.out.println("Second small: " + secondSmallest);
        }else {
            System.out.println("Small: " + Arrays.toString(arr));
        }
    }

    void largeSmall(int[] arr){
        int max = arr[0];
        int min = arr[0];


        if (arr.length >=2){
            for (int i = 0; i<arr.length; i++){
                if (arr[i] > max){
                    max = arr[i];
                }
                else if (arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.println("\nMax: " + max + "\nMin: " + min);
        }else {
            System.out.println(Arrays.toString(arr));
        }
    }
}
