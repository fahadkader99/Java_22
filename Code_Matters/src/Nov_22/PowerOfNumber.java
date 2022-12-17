package Nov_22;

import java.util.Scanner;

public class PowerOfNumber {
    // find the power of a number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int a = scanner.nextInt();
        System.out.println("Enter the Power ");
        int b = scanner.nextInt();
        scanner.close();
        int c = a;


        for (int i=1; i<b; i++){
            a = a*c;
        }
        System.out.println("Result = " + a);
    }
}
