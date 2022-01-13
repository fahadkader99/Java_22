package practice_session.Basics_Code;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /**
         * In math, the factorial of a positive integer n, denoted by n! is the product of all integers less than or equal to n.
         * Calculate factorial and output result to the console.
         * ex: 5! = 5 * 4 * 3 * 2 * 1
         * Enter a number:
         * 5
         * Factorial result: 120
         */
        //TODO write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        long number = scanner.nextLong();

        Factorial factorial = new Factorial();
        factorial.calculate(number);

    }

    public void calculate(long number) {
        long temp = 1;
        for (int i = 1; i <=number; i++){
            temp = temp * i;

        }
        System.out.println("Factorial is: " + temp);
    }
}
