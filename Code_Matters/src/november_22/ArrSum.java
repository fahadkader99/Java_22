package november_22;

import java.util.Scanner;

public class ArrSum {
    // find the sum of all the array elements

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i< arr.length; i++){
            System.out.println("Enter element " +(i+1));
            arr[i] = sc.nextInt();


        }

        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
        sc.close();
    }
}
