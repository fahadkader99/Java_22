package a_practice;

import java.util.Scanner;

public class ReverseNum {
    // reverse a given number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num1 = scanner.nextInt();
        int num = num1;
        int rev = 0;
        while (num!=0){
            int remainder = num%10;
            rev= (rev*10)+remainder;
            num = num/10;
        }

        System.out.println("Reversed: " + rev);
    }
}
