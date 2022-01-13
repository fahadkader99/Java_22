package pair_Program.others;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    /*
    Fibonacci: is the result of their previous 2 number. so last 2 num will be the addition of 3rd num

    example: 0 1 1 2 3 5 8 13 21  { first + second = fibonacci }

    Fibonacci can be found using Recursion and without using recursion.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Using regular for loop");
        System.out.println("2. Using Array");
        System.out.print("# ");
        int choice = scan.nextInt();
        switch (choice){
            case 1: fibonacciMethod1();
            break;
            case 2: fibonacciMethod2();
            break;
            default:
                System.out.println("Wrong input. Try again");
                break;
        }
    }
    public static void fibonacciMethod1(){
        Scanner s = new Scanner(System.in);
        System.out.println("Num. of series want to see: ");
        int num = s.nextInt();

        int first = 0;
        int second = 1;
        int fibo = 0;

        System.out.print(first+" "+ second);

        for (int i = 3; i<= num; i++){
            fibo = first+second;
            System.out.print(" "+ fibo);
            first = second;
            second = fibo;
        }
        System.out.println("\n");
    }
    public static void fibonacciMethod2(){      // referred from Elena
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter how many n-numbers would you like to get: ");
        int amount = s.nextInt()+1;

        int[] arr = new int[amount];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 0; i <amount-2; i++){
            arr[i+2] = arr[i] + arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
