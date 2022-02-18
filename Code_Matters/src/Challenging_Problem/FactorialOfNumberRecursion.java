package Challenging_Problem;

import java.util.Scanner;

public class FactorialOfNumberRecursion {
    // find factorial of a given number:

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();
        sc.close();

        //method1(num);
        System.out.println(usingRecursion(num));

    }
    public static void method1(int num){
        int factor = 1;
        for (int i = 1;i <= num;i++){
            factor = factor*i;
        }
        System.out.println("Factorial of "+num+" is "+ factor);
    }
    public static int usingRecursion(int num){
        // 5! = 5 * 4 * 3 * 2 * 1
        // ! means factorial
        // Recursion is a method that call itself.

        if (num ==1){
            return 1;
        }else {
            num = num * usingRecursion(num-1);
        }

        return num;


    }
}
