package c_Bat.array2;

import java.util.Scanner;

public class bigDiff {
    /*
    Given an array length 1 or more of ints, return the difference between the largest
    and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
    methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int[] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter element: " + (i + 1));
            num[i] = sc.nextInt();
        }

        int small = num[0];
        int big = num[0];
        for (int i = 0; i<num.length;i++){
            small = Math.min(small, num[i]);
            big = Math.max(big,num[i]);
        }

        System.out.println("Min: " + small);
        System.out.println("Max: " + big);


        System.out.println("Difference: " + (big-small));



    }
}
