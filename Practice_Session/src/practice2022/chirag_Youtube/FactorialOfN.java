package practice2022.chirag_Youtube;

import java.util.Scanner;

public class FactorialOfN {
    // find factorial of N
    // n = 5 : 1 * 2 * 3 * 4 * 5

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a No. ");
        int n = s.nextInt();

        int factor = 1;
        for (int i = 1; i <= n; i++){
            factor *=i;
        }
        System.out.println("Factorial of "+ n+ " is = "+ factor);

    }
}
