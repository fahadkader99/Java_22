package w3School;

import java.util.Scanner;

public class Practice3 {
    /*
    Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, result;

        System.out.println("1st Number: ");
        num1 = input.nextInt();

        System.out.println("2nd Number: ");
        num2 = input.nextInt();

        result = num1 * num2;
        System.out.println("Expected Output: " + result);
    }
}
