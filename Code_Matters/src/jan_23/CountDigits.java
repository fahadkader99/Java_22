package jan_23;

import java.util.Scanner;

public class CountDigits {
    // find out the number of digits in a given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        sc.close();
        int b = a;
        int count = 0;
        int reverse = 0;

        while (b > 0){
            int rem = b % 10;
            reverse = (reverse * 10) + rem;
            b = b/10;
            count++;
        }
        System.out.println("\nReversed of " + a + " is = " + reverse);
        System.out.println("Total digit of " + a + " is = "  + count);


    }
}
