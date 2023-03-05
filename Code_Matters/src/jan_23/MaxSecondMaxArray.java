package jan_23;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSecondMaxArray {
    // print the max and second max number from an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int range = sc.nextInt();

        int[] arr = new int[range];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element: " + (i + 1));
            arr[i] = sc.nextInt();
        }


        System.out.println();

        MaxSecondMaxArray max = new MaxSecondMaxArray();
        //max.one(arr);
        max.two(arr);


    }

    void one(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int secondMax = arr[arr.length - 2];
        System.out.println(max);
        System.out.println(secondMax);
    }

    void two(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);

        for (int i = arr.length-2; i>=0; i--){
            if (arr[i] != arr[arr.length-1]){
                System.out.println("Second Max: " + arr[i]);
                break;
            }
        }

        for (int i = 0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min );
    }
}