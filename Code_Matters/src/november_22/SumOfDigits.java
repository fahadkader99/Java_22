package november_22;

import java.util.Scanner;

public class SumOfDigits {
    // Find  the sum of a digits of a given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int a = sc.nextInt();
        int b = a;
        sc.close();
        int sum = 0;

        while (b !=0){
            int rem = b % 10;
            sum+= rem;
            b = b / 10;
        }

        System.out.println("Sum of " + a +" is = " + sum);
    }
}
