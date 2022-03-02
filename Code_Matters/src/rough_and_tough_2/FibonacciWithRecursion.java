package rough_and_tough_2;

import java.util.Scanner;

public class FibonacciWithRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a term: ");
        int n = sc.nextInt();


        System.out.println(fibonacci(n));
    }
    public static long fibonacci(int n){
        if (n<=1){
            return n;
        }
         return (fibonacci(n-1)+fibonacci(n-2));
    }
}
// this recursive algorithm is very slow, if i put 50 as input it will take around 2 min to give the output