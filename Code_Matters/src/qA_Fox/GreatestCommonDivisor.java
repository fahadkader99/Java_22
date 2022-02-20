package qA_Fox;

import java.util.Scanner;

public class GreatestCommonDivisor {
    // find the greatest common divisor of a given 2 number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b  = sc.nextInt();

        int div = 0;

        for (int i = 1; i<=a && i<=b; i++){
            if (a%i==0 & b%i==0){
                div = i;
            }
        }
        System.out.println("Greatest divisor between 2 num: "+div);

    }
}
