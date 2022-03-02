package qA_Fox_3;

import java.util.Scanner;

public class NumOfCharInString {
    // find number of letters, digits , spaces  and other things inputted in the statement.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statement with any random text:");
        String str = sc.nextLine();

        char [] ch = str.toCharArray();

        int digit = 0;
        int whiteSpace =0;
        int letter = 0;
        int other = 0;

        for (Character c : ch){
            if (Character.isDigit(c)){
                digit++;
            }
            else if (Character.isWhitespace(c)){
                whiteSpace++;
            }
            else if (Character.isLetter(c)){
                letter++;
            }
            else {

                other++;
            }
        }

        System.out.println("No of digit: "+ digit);
        System.out.println("No of whiteSpace: "+ whiteSpace);
        System.out.println("No of letter: "+ letter);
        System.out.println("No of other: "+ other);


    }


}
