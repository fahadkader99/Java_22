package jan_23;

import java.util.Scanner;

public class FactorialNum {
    //find the factorial of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int a = sc.nextInt();
        sc.close();

        int factor = 1;

        for (int i = 1; i<= a; i++){
            factor*= i;
        }
        System.out.println(factor);
    }
}
