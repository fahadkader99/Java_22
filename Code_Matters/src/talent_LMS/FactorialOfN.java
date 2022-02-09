package talent_LMS;

import java.util.Scanner;

public class FactorialOfN {
    // find factorial of given num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        sc.close();

        int factor = 1;
        for (int i = 1; i<=num; i++){
            factor *= i;
        }
        System.out.println("Factorial of "+ num + " is "+ factor);
    }
}
