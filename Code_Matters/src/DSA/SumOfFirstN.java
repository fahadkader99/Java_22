package DSA;

import java.util.Scanner;

public class SumOfFirstN {
    // find the sum of first N numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int num = sc.nextInt();
        sc.close();

        // Find the time taken by algorithm:

        double now = System.currentTimeMillis();                                                                         // Not the best approach - but gives rough estimation

        one(num);
        //two(num);

        System.out.println("\nTime taken - " + (System.currentTimeMillis() - now) + " milli secs. ");

    }
    static int one(int num) {                       // For loop - Iterating N times -> Slow time complexity
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum+= i;
        }
        System.out.println("Sum of " + num +" = " + sum);
        return sum;
    }

    static int two(int num){                        // mathematical formula (constant statement) -> very fast time complexity

        int sum = num * (num + 1) / 2;

        System.out.println("Sum of " + num +" = " + sum);
        return sum;
    }
}
