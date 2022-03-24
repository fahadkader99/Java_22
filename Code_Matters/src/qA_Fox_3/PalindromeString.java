package qA_Fox_3;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        String str = s;

        String r = "";
        for (int i =s.length()-1; i>=0 ;i--){
            r+= s.charAt(i);
        }
        System.out.println(r);

        if (str.equals(r)){
            System.out.println("Palindrome string");
        }else {
            System.out.println("Not palindrome");
        }

    }
}
