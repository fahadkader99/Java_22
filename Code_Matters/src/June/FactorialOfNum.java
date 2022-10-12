package June;

import java.util.Scanner;

public class FactorialOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num to find if it is a factorial ");
        int num = sc.nextInt();

        int factor = 1;

        for (int i = 1; i<=num; i++){
            factor*= i;
        }

        System.out.println(factor);

    }
}
