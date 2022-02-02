package talent_LMS;

import java.util.Scanner;

public class PhoneKeyPad {
    /*
    On your phone keypad, the alphabets are mapped to digits as follows: ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
    Write a program called PhoneKeyPad, which prompts user for a String (case insensitive), and converts to a sequence of keypad digits.
    Use (a) a nested-if, (b) a switch-case-default.

Hints
You can use in.next().toLowerCase() to read a String and convert it to lowercase to reduce your cases.
In switch-case, you can handle multiple cases by omitting the break statement, e.g.,
switch (inChar) {
   case 'a': case 'b': case 'c':  // No break for 'a' and 'b', fall thru 'c'
      System.out.print(2); break;
   case 'd': case 'e': case 'f':
      ......
   default:
      ......
}
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a':
            case 'b':
            case 'c':
                System.out.println(2);
                break;
            case 'd':
            case 'e':
            case 'f':
                System.out.println(3);
                break;
            case 'g':
            case 'h':
            case 'i':
                System.out.println(4);
                break;
            case 'j':
            case 'k':
            case 'l':
                System.out.println(5);
                break;
            case 'm':
            case 'n':
            case 'o':
                System.out.println(6);
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                System.out.println(7);
                break;
            case 't':
            case 'u':
            case 'v':
                System.out.println(8);
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println(9);
                break;

            default:
                System.out.println("Try again");
                break;


        }


    }
}
