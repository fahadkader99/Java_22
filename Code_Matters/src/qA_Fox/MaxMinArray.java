package qA_Fox;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    // find the max and min number in array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[]num = new int[size];

        for (int i = 0; i< num.length;i++){
            System.out.println("Enter element: "+(i+1));
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int max = num[0];
        int min = num[0];

        for (int i = 0; i<num.length;i++){
            if (num[i] > max){
                max = num[i];
            }
        }

        for (int i = 0; i<num.length;i++){
            if (num[i] <min){
                min = num[i];
            }
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+ min);



    }
}
