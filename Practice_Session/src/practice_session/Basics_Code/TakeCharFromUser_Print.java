package practice_session.Basics_Code;

import java.util.Scanner;

public class TakeCharFromUser_Print {
    // take a char input from user and output the same way

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a character");
        char c = input.next().charAt(0);

        System.out.println(c);




    }
}
