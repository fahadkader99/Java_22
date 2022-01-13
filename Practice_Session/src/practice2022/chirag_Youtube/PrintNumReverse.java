package practice2022.chirag_Youtube;

import java.util.Scanner;

public class PrintNumReverse {
    // print the reverse order of N || reverse the given num.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a No. ");
        int n = s.nextInt();

        int reverse = 0;
        int lastDigit= 0;
        while (n > 0){
            lastDigit = n % 10;
            reverse = reverse *10 + lastDigit;
            n = n/10;
        }

        /*
        step 1 - Isolate the last digit in number. lastDigit = number % 10
        step 2 - Append lastDigit to reverse. reverse = (reverse * 10) + lastDigit.
        step 3 - Remove last digit from number. number = number / 10.
         */

        System.out.println("Reversed: "+ reverse);

    }
}
