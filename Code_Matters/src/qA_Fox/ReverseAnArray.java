package qA_Fox;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    // reverse an array by taking input from user

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int []num = new int[size];

        for (int i = 0; i< num.length;i++){
            System.out.println("Enter element: "+(i+1));
            num[i] = sc.nextInt();
        }

        System.out.println("Before reverse");
        System.out.println(Arrays.toString(num));

        System.out.println("After reverse");
        for (int i = num.length-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }



    }

}
