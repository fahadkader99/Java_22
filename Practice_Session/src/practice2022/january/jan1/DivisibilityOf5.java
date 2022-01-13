package practice2022.january.jan1;

import java.util.Scanner;

public class DivisibilityOf5 {
    // write a program to fine the divisibility by 5 or not.
    // Divisible = means a number goes evenly with no remainder.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = input.nextInt();

        if (num % 5 ==0){
            System.out.println("Divisible by 5. ");
        }
        else {
            System.out.println("Not Divisible by 5. ");
        }



    }
}
