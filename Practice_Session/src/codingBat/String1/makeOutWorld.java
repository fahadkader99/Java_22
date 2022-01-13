package codingBat.String1;

import java.util.Scanner;

public class makeOutWorld {
    /**
     * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is
     * in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting
     * at index i and going up to but not including index j.
     *
     *
     * makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     * makeOutWord("[[]]", "word") → "[[word]]"
     *
     */

    public static void main(String[] args) {

//        String outer = "[[]]";
//        String inner = "Word";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter str 1: ");
        String outer = input.nextLine();        // "[[]]"
        System.out.println("Enter str 2: ");
        String inner = input.nextLine();        // "Word"


        StringBuilder sb1 = new StringBuilder(outer);
        StringBuilder sb2 = new StringBuilder(inner);

        sb1.insert(2,sb2);

        System.out.println(sb1);


    }
}
