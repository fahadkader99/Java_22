package Nov_22;

import java.util.Arrays;
import java.util.Scanner;

public class Take6NumAvg {
    // take 6 number and find avg of them

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 number");

        int[] arr = new int[6];
        for (int i=0; i< arr.length;i++){
            System.out.println("Enter num " + (i+1));
            arr[i] = sc.nextInt();
        }


        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        System.out.println(sum);
        double avg = sum / 6;

        System.out.println("Average of 6 num " + avg);

    }
}
