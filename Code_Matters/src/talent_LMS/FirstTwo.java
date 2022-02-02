package talent_LMS;

import java.util.Scanner;

public class FirstTwo {
    /*
    Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is, so "X" yields "X",
    and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();

        if (str.length()<=2){
            System.out.println(str);
        }
        if (str.length()>2){
            System.out.println(str.substring(0,2));
        }



    }
}
