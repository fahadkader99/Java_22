package march_april_23;

import java.util.Scanner;

public class ArrayAvgElements {
    // find the avg of array elements - dynamically
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter element " + (i+1));
            arr[i] = sc.nextInt();
        }

        double avg = 0;
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum+= arr[i];
        }

        avg = sum / size;

        System.out.println("Avg: " + avg );

    }

}
