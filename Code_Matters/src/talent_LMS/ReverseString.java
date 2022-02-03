package talent_LMS;

import java.util.Scanner;

public class ReverseString {
    /*
    Write a program called ReverseString, which prompts user for a String, and prints the reverse of the String by
    extracting and processing each character. The output shall look like:

Enter a String: abcdef
The reverse of the String "abcdef" is "fedcba".
     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String r = "";

        for (int i = 0; i <str.length();i++){
            r = str.charAt(i)+r;
        }
        System.out.println(r);
    }
}
