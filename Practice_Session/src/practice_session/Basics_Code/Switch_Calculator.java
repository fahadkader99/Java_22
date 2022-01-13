package practice_session.Basics_Code;

import java.util.Scanner;

public class Switch_Calculator {
    public static void main(String[] args) {
        int a= 100, b = 20;
        System.out.println("Enter user choice.\n");
        Scanner r = new Scanner(System.in);
        int choice = r.nextInt();

        switch (choice){
            case 1:
                System.out.println("Sum = " + (a+b));
                break;
            case 2:
                System.out.println("Negation = " + (a-b));
                break;
            case 3:
                System.out.println("Multiply = " + (a*b));
                break;
            case 4:
                System.out.println("Division = " + (a/b));
                break;
            case 5:
                System.out.println("Modulo = " + (a % b));

            default:
                System.out.println("Invalid Choice!");

        }

    }
}
