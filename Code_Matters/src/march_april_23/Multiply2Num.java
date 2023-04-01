package march_april_23;

import java.util.Scanner;

public class Multiply2Num {
    // take inout of 2 num & print their output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Num: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Num: ");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("Product of " + a + " & " + b + " is: " + product);
    }
}
