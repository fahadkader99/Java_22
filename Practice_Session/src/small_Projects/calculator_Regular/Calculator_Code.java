package small_Projects.calculator_Regular;

/*
input > n1 , n2 (select operation, the one you want to perform) > result

Operation> addition, sub, mul, division, remainder
 */


import java.util.Scanner;

public class Calculator_Code {
    public static void main(String[] args) {

        int n1, n2;     // new need at least 2 numbers to perform calculation
        int cal;

        System.out.println("\nMY_Calculator___\n");
        System.out.println("Enter 1st Number: ");
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        System.out.println("Enter 2nd Number: ");
        n2 = s.nextInt();
        System.out.println("Select Operation: ");
        System.out.println("1 . Addition");
        System.out.println("2 . Subtraction");
        System.out.println("3 . Multiplication");
        System.out.println("4 . Division");
        System.out.println("5 . Remainder");
        int ch = s.nextInt();

        if (ch == 1) {
            cal = n1 + n2;
            System.out.println("Addition: " + cal);

        } else if (ch == 2) {
            cal = n1 - n2;
            System.out.println("Subtraction: " + cal);

        } else if (ch == 3) {
            cal = n1 * n2;
            System.out.println("Multiplication: " + cal);
        } else if (ch == 4) {
            cal = n1 / n2;
            System.out.println("Division: " + cal);
        } else if (ch == 5) {
            cal = n1 % n2;
            System.out.println("Remainder: " + cal);
        } else {
            System.out.println("Invalid Input...! ");
        }




    }
}
