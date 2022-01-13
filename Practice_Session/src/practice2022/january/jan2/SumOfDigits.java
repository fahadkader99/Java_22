package practice2022.january.jan2;

import java.util.Scanner;

public class SumOfDigits {
    // find sum of given digits
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits: ");
        int num = input.nextInt();
        int sum = 0;
        int remainder = 0;

        while (num >0){
            remainder = num % 10;
            sum = sum+ remainder;
            num = num /10;
        }
        System.out.println("Sum of digits: "+ sum);


    }
}
