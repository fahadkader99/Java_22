package talent_LMS;

import java.util.Scanner;

public class StrHalf {
    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        if (str.length()%2==0){
            System.out.println(str.substring(0,str.length()/2));
        }else {
            System.out.println("Try with Even num of string!!");
        }



    }
}
