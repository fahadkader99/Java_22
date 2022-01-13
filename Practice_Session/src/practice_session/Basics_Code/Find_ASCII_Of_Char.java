package practice_session.Basics_Code;

import java.util.Scanner;

public class Find_ASCII_Of_Char {
    // Find ASCII value of a character.

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter a character to see ASCII value: ");
        char c = i.next().charAt(0);
        int a = c;  // auto casting.

        System.out.println("ASCII value of " + c + " is : " + a);


    }
}
