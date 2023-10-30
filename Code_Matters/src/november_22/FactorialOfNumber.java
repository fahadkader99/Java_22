package november_22;

import java.util.Scanner;

public class FactorialOfNumber {
    // find the factorial of a given number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();
        sc.close();

        int fac = 1;
        for (int i = 1; i<=num; i++){
            fac = fac*i;
        }
        System.out.println(fac);
    }
}
