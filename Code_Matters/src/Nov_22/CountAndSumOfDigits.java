package Nov_22;

import java.util.Scanner;

public class CountAndSumOfDigits {
    public static void main(String[] args) {
        // find the count of the digit and their sum
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int a = sc.nextInt();
        int b = a;
        int count = 0;
        int sum = 0;

        while (b!=0){
            int rem = b %10;
            sum+= rem;
            b = b/10;
            count++;

        }
        System.out.println("Num of Digits " + count);
        System.out.println("Total = " + sum);
    }
}
