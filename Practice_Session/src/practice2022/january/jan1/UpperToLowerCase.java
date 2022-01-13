package practice2022.january.jan1;

import java.util.Scanner;

public class UpperToLowerCase {
    // convert char upper to lower and vice versa
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a char: ");
        char ch = input.next().charAt(0);
        System.out.println("1. To Lower ");
        System.out.println("2. To Upper ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                toLower(ch);
                break;
            case 2:
                toUpper(ch);
                break;
        }

    }

    public static void toUpper(char ch) {
        char result = ' ';
        if (ch >= 97 && ch <= 122) {
            result = Character.toUpperCase(ch);
        }
        System.out.println("To Upper: " + result);

    }

    public static void toLower(char ch) {
        char result = ' ';

        if (ch >= 65 && ch <= 90) {
            result = Character.toLowerCase(ch);
        }
        System.out.println("To Lower: " + result);
    }
}
