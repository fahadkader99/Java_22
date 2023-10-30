package november_22;

import java.util.Scanner;

public class FibonacciTillNumber {
    // Print a Fibonacci number till a given number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Range ");
        int range = scanner.nextInt();
        scanner.close();

        int a =0;
        int b =1;
        int c =0;
        System.out.print(a+" " + b+" ");

        while (c<=range){
            c = a+b;
            if (c>range){
                break;
            }
            System.out.print(c+" ");
            a = b;
            b = c;

        }



    }
}
