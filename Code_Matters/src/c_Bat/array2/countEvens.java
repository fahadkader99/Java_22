package c_Bat.array2;

import java.util.Scanner;

public class countEvens {
    /*
    Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder,
    e.g. 5 % 2 is 1.


countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
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


        int count = 0;
        for (int i = 0; i <= num.length; i++) {
            if (num[i] % 2 == 0) {
                count++;

            }
            System.out.println("No of even: " + count);
        }
    }
}