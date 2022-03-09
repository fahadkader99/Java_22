package march_22;

import java.util.Scanner;

public class PalindromeString {
    // find out if the string is palindrome or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String r = "";
        for (int i = str.length()-1; i>=0; i--){
            r += str.charAt(i);
        }

        System.out.println(r);

        if (str.equals(r)){
            System.out.println("Palindrome");
        }else System.out.println("Not palindrome");



    }
}
