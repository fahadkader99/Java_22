package march_22;

import java.util.Scanner;

public class FindGreatestCommonDivisor {
    // find the greatest common divisor of a given numbers or of 2 number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int gcd = 0;

        for (int i = 1; i<=a; i++){

            if (a % i ==0 && b % i ==0){
                 gcd = i;

            }
        }

        System.out.println("Greatest divisor of the given numbers: "+ gcd);

    }

}
