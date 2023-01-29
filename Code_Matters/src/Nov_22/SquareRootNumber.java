package Nov_22;

import java.util.Scanner;

public class SquareRootNumber {
    // find the square root of a given number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Num: ");
        int a = sc.nextInt();

        System.out.println("\nSquare root of the Num: " + Math.sqrt(a));
    }
}
