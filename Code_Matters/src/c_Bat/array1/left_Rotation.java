package c_Bat.array1;

import java.util.Arrays;
import java.util.Scanner;

public class left_Rotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[]num1 = new int[size];

        for (int i = 0; i < num1.length;i++){
            System.out.println("Enter element: "+(i+1));
            num1[i]= sc.nextInt();
        }

        System.out.println("\nBefore Rotate: "+ Arrays.toString(num1));

        System.out.println("\nAfter left rotation: ");
        int first = num1[0];

        for (int i = 1; i< num1.length;i++){
            num1[i-1]=num1[i];
        }

        num1[num1.length-1]=first;

        System.out.println(Arrays.toString(num1));



    }
}
