package practice_session.Basics_Code;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /**
         * Palindrome is the same word when you read it from the end to beginning
         * Write a program so that it can verify it is a palindrome or not
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str = input.nextLine();

        Palindrome pal = new Palindrome();
        pal.findPalindrome(str);

    }
    public void findPalindrome(String word){
        int length = word.length();
        String newWord = "";

        for (int i = (length-1); i >=0; i--){
            newWord = newWord+word.charAt(i);
        }
        if (word.equalsIgnoreCase(newWord.toLowerCase())){
            System.out.println("Word is Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
