package leetCode;

import java.util.Scanner;

public class FindFactorialOfN {
    // find factorial of N
    // n = 5 : 1 * 2 * 3 * 4 * 5
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Num;");
        int num = s.nextInt();
        int factor = 1;
        for (int i = 1; i <=num; i++){
            factor =factor*i;
        }
        System.out.println("Factorial of N "+ factor);

    }
}
