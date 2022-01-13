package practice_session.Array.W3;

import java.util.Scanner;

public class avgValue {
    /**
     * Write a Java program to calculate the average value of array elements
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the size and elements:");

        int [] arr = new int[input.nextInt()];

        for (int i =0; i < arr.length; i++){        // taking input
            arr[i]=input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i< arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("The sum is: "+ sum);
        System.out.println("The average is: "+ sum/arr.length);

    }
}
