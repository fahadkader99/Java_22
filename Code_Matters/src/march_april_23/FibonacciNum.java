package march_april_23;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Range: ");
        int range = sc.nextInt();
        sc.close();

        FibonacciNum fibonacciNum = new FibonacciNum();
        fibonacciNum.fibo(range);

    }

    void fibo(int range){
        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a + " " + b+" ");

        while (range >= temp){
            temp = a+b;
            if (temp > range){
                break;
            }
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }
    }
}
