package talent_LMS;

import java.util.Scanner;

public class PalindromeChecker {
    /*A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
    such as madam or racecar or the number 10801.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String s = str;
        sc.close();

        String r = "";
        for (int i = str.length()-1; i>=0;i--){
            r = r+str.charAt(i);
        }

        System.out.println(r);

        if (s.equals(r)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");

    }
}
