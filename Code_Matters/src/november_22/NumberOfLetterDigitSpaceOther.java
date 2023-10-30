package november_22;

import java.util.Scanner;

public class NumberOfLetterDigitSpaceOther {
    // print number of letters, digits, space & other
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String a = sc.nextLine().trim();
        sc.close();

        char[] ch = a.toCharArray();

        int letter = 0;
        int digit = 0;
        int spaces = 0;
        int other = 0;

        for (Character c : ch){

            if (Character.isLetter(c)){
                letter++;
            }
            else if (Character.isDigit(c)){
                digit++;
            }
            else if (Character.isSpaceChar(c)){
                spaces++;
            }
            else {
                other++;
            }

        }

        System.out.println("Letter = " + letter );
        System.out.println("Digits = " + digit);
        System.out.println("Spaces = " + spaces);
        System.out.println("Other char = " + other);


    }
}
