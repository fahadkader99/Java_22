package qA_Fox_3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        // print the fibonacci series till the inputted number:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int series = sc.nextInt();

        // fibonacci always start with first 2 number:
        int a = 1;
        int b = 1;
        int fibo = 0;
        System.out.print(a+" "+ b+" ");

        while (fibo<=series){
            fibo = a+b;

            if (fibo > series) break;

            System.out.print(fibo+" ");

            a = b;
            b = fibo;

        }
        sc.close();


    }
}
