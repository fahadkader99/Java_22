package jan_23;

import java.util.Scanner;

public class SumOfDigit {
    // find the sum of a given number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int a = sc.nextInt();

        int sum = 0;
        int count = 0;

        while (a > 0){
            int rem = a % 10;
            sum+= rem;
            a = a/10;
            count++;
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Count " + count);



    }
}
