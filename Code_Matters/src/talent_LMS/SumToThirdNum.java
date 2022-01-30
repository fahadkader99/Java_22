package talent_LMS;

import java.util.Scanner;

public class SumToThirdNum {
    /*
    Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Num");
        int b = sc.nextInt();
        System.out.println("Enter 3rd num");
        int c = sc.nextInt();


        int sum = a+b;
        if (sum==c){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }
}
