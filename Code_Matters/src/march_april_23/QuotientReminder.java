package march_april_23;

import java.util.Scanner;

public class QuotientReminder {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int quotient = (a / b);
        int remainder = (a % b);

        System.out.println("Quotient: " + quotient +"\nRemainder: " + remainder);


    }
}
