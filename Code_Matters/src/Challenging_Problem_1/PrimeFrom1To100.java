package Challenging_Problem_1;

import java.util.Scanner;

public class PrimeFrom1To100 {
    public static void main(String[] args) {
        // prime num = a number that divide by 1 and the num itself - that means a prime number has 2 divisor.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        sc.close();

        for (int i = 2; i <=num ;i++){

            boolean isPrime = true;

            for (int j = 2; j<i ; j++){

                if (i % j == 0){
                    isPrime = false;
                    break;
                }

            }

            if (isPrime){
                System.out.print(i+" ");
            }


        }

    }
}
