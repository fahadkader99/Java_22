package c_Bat.warmUp2;

import java.util.Scanner;

public class arrayCount9 {
    /*
    Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();


        int[] arr = new int[size];
        for (int i = 0; i<arr.length;i++){
            System.out.println("Enter element "+ (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number looking for");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]==target){
                count++;
            }
        }

        System.out.println(count);




    }
}
