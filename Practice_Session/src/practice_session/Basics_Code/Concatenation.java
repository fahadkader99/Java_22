package practice_session.Basics_Code;

import java.util.Scanner;

public class Concatenation {
    /**
     * Write a function that concatenates two words into single,
     * however if the concatenation creates a similar double char, then omit one of the characters
     * ex:
     * "abc" "cat" -> "abcat"
     *
     * ex2:
     * abc", "xyz" -> "abcxyz"
     *
     * ex3:
     * "happy", "yolk" -> happyolk
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st word: ");
        String word1 = input.nextLine();
        System.out.println("Enter 2nd word: ");
        String word2 = input.nextLine();

        Concatenation c = new Concatenation();
        System.out.println("The result is: " + c.concat(word1, word2));


    }
// since string is immutable, we can't change. Thas why we have to cut them accordingly and put it in a new variable and play with them.

    public String concat(String word1, String word2) {
        char ch1 = word1.charAt(word1.length()-1);
        char ch2 = word2.charAt(0);
        String str;
        if (ch1 == ch2){
            str = word1.substring(0,word1.length()-1);
            return str.concat(word2);
        }else {
            return word1.concat(word2);
        }


    }
}
