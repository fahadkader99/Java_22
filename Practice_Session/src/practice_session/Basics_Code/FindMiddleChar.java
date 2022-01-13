package practice_session.Basics_Code;

import java.util.Scanner;

public class FindMiddleChar {
    public static void main(String[] args) {

        /**
         * Write a java program that prints middle char(s)
         *  1) when odd number of chars and more than 2 chars, print a middle character. ex: cat -> a
         *  2) when even number of chars and more than 3 chars, print 2 middle characters. ex: java -> av
         *  3) if a single character, print character 3 times. ex: & -> &&&
         *  4) if a double character, print characters 2 times. ex: @@ -> @@@@
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String text = input.nextLine();

        System.out.println("Middle one: ");         //for showing result, not for taking input
        FindMiddleChar middle = new FindMiddleChar();
        middle.printMiddleOne(text);


    }

    public void printMiddleOne(String text) {
        int length = text.length();             // putting char length into integer variable
        String str;
        char c;
        int temp;

        if (length > 2 && length % 2 != 0) {
            temp = (length - 1) / 2;            // dividing uneven word and getting middle
            c = text.charAt(temp);          // putting the middle char in c
            System.out.println(c);          // printing c / middle char!

        } else if (length > 3 && length % 2 == 0) {
            temp = length / 2;
            str = text.substring(temp - 1, temp + 1);
            System.out.println(str);

        } else if (length == 1) {              // if length single or ==1 , printing 3 times.
            System.out.println(text + text + text);

        } else if (length == 2) {                 // if length is 2, then print twice
            System.out.println(text + text);
        }
    }

}
