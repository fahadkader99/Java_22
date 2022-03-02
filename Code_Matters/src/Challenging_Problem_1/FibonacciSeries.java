package Challenging_Problem_1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int temp = 0;

        System.out.print(a+" "+b+" ");

        while (temp<=num){
            temp = a+b;

            if(temp>num){
                break;
            }
            System.out.print(temp+" ");
            a = b;
            b = temp;

        }


    }
}
