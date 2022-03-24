package Challenging_Problem_1;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPalindromeInString {
    // find the largest palindrome in a string || the longest palindromic substring
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();




    }
    public static String longestPalindrome(String str){
        // always starts with boundary check || validation

        if (str.length() < 2){
            return str;
        }
        return "";

    }
}
