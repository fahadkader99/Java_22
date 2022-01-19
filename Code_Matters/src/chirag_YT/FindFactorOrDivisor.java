package chirag_YT;

import java.util.Scanner;

public class FindFactorOrDivisor {
    // Find divisor of a given num
    // Divisor - a number that divides and int perfectly

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();

        System.out.println("Divisor of "+ n+ ": ");
        for (int i = 1; i <= n; i++){
            if (n % i ==0){
                System.out.print(i+" ");
            }
        }


    }
}
