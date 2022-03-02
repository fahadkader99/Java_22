package qA_Fox_3;

import java.util.Scanner;

public class DivisorOfNumbers {
    // find the greatest common divisor of given numbers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int divMax = 0;
        for (int i = 1; i<= a && i <= b; i++){
            if (a % i ==0 && b % i == 0){
               divMax = i;
            }
        }
        System.out.println("Greatest divisor = "+divMax);


    }
}
