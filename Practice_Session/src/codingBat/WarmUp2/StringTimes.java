package codingBat.WarmUp2;

import java.util.Scanner;

public class StringTimes {
    /**
     * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     *
     *
     * stringTimes("Hi", 2) → "HiHi"
     * stringTimes("Hi", 3) → "HiHiHi"
     * stringTimes("Hi", 1) → "Hi"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.nextLine();
        System.out.println("No. of times to concat: ");
        int num = input.nextInt();
        int count = 0;


        String returns = "";

        for (int i = 0; i <num; i++ ){
            returns+= str;
            count++;
        }

        System.out.println(returns);


    }
}
