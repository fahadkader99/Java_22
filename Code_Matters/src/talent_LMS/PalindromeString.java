package talent_LMS;

import java.util.Scanner;

public class PalindromeString {
    // check if the string is palindrome

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String original = str;

        String r = "";

        for (int i = 0; i<str.length();i++){
            r = str.charAt(i)+r;
        }
        System.out.println(r);

        if (original.equals(r)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");

        withArray(str);
    }

    public static void withArray(String str){
        String original = str;

        char[] ch = str.toCharArray();
        String r = "";
        for (int i =ch.length-1; i>=0;i--){
            r+=ch[i];
        }

        if (original.equals(r)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");


    }

}
