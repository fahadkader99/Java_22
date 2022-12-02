package Nov_22;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargeSmallArray {
    public static void main(String[] args) {
        // find the smallest and largest element in Array

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i =0; i< arr.length; i++){
            System.out.println("Enter element " + (i+1));
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int min = arr[0];
        int max = arr[0];

        for (int i=0; i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min " + min);

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max " + max);



    }
}
