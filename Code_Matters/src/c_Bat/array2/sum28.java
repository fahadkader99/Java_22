package c_Bat.array2;

import java.util.Arrays;
import java.util.Scanner;

public class sum28 {
    /*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();


        int[]num = new int[size];
        for (int i = 0; i<num.length;i++){
            System.out.println("Enter element: "+(i+1));
            num[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(num));


    }
}
