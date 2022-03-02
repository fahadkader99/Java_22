package rough_and_tough_2;

import java.util.Scanner;

public class FibonacciRecursionWithArrayFaster {

    private static long[] fibonacciCache;                             // saving the fibo value in a array
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a term: ");
        int n = sc.nextInt();

        fibonacciCache = new long[n+1];                             // coz if we want to find the fibo of a number it is always moving forward.

        System.out.println(fibonacci(n));
    }
    public static long fibonacci(int n){

        if (n<=1){                                  // base case || exit criteria
            return n;
        }

        if (fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }


        long nthFibonacciNumber = (fibonacci(n-1)+fibonacci(n-2));
         fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
