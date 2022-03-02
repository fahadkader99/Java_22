package qA_Fox_3;

import java.util.Scanner;

public class quotientRemainder {
    // take input of 2 number and find quotient and remainder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");    // quotient is a the division
        int num = sc.nextInt();
        System.out.println("Enter a divisor: ");
        int divisor = sc.nextInt();

        int quotient = (num / divisor);

        int remaider = (num % divisor);

        System.out.println(quotient);
        System.out.println(remaider);

        sc.close();


    }
}
