package practice2022.january.jan2;

import java.util.Scanner;

public class FactorOfANumber {
    // Find factor of a Number.
    // Factor : is a number which can be used to divisible the given number.
    // ex: n = 10, Factor: 1, 2, 5, 10. (all are factor and divisible for 10)

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i+ " ");
            }
        }
    }
}
