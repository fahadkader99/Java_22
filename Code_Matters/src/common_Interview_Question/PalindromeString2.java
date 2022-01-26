package common_Interview_Question;

import java.util.Scanner;

public class PalindromeString2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String ori = str;

        String empty = "";

        for (int i = 0; i <str.length();i++){
            empty = str.charAt(i)+empty;
        }
        System.out.println(empty);

        if (ori.equals(empty)){
            System.out.println("Palindrome String");
        }else System.out.println("Not Palindrome");

    }
}
