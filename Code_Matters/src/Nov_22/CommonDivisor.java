package Nov_22;

import java.util.Scanner;

public class CommonDivisor {


    public static void main(String[] args) {
        // FInd the greatest common divisor between 2 number


        /*
        - take 2 number
        - find the divisors between A & B & print the larget
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);

        int div = 0;

        for (int i = 1; i<=max; i++ ){

            if (a % i == 0 && b % i == 0){

                div = i;
            }
        }

        System.out.println(div);


    }




}
