package march_22;

import java.util.Scanner;

public class PrimeNum {
    // find prime number or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int num = sc.nextInt();

        // prim num is a num that is divisible by 1 and the num itself

        int count = 0;

        for (int i = 1; i<=num; i++){
            if (num % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println( " prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
