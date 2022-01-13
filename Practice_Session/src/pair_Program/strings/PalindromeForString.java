package pair_Program.strings;

import java.util.Scanner;

public class PalindromeForString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine().toLowerCase();

        sbMethod(str);
        arithmeticMethod(str);


    }
    public static void sbMethod(String str){            // using string builder
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();   // 1st we are reversing
        String reverse = sb.toString();     // 2nd we are making that reverse as string, then we will compare

        System.out.println("\nMethod1");
        if (reverse.equals(str)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");

    }
    public static void arithmeticMethod(String str){      // using arithmetic operation

        String reverse = "";
        for (int i = str.length()-1; i>=0 ; i--){
            reverse += str.charAt(i);
        }

        System.out.println("\nMethod2");
        if (reverse.equals(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Try again");
        }


    }

}
