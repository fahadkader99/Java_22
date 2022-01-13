package practice2022.january.jan1;

import java.util.Scanner;

// find sum of N natural number.
public class SumOfNNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a num for N: ");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum of N num: "+ sum);
    }
}
