package a_practice;

import java.util.Scanner;

public class FactorialNum {
    // find a factorial of a given number
    //factorial of 5 = 5*4*3*2*1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int num = sc.nextInt();

        int factor = 1;
        for (int i =1; i<= num; i++){
            factor*= i;
        }
        System.out.println("Factorial of " + num +" = " + factor);
    }
}
