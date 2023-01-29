package Nov_22;

import java.util.Scanner;

public class PalindromeString {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String a = sc.nextLine().toLowerCase().trim();
        String b = a;

        String rev = "";
        for (int i = b.length()-1; i>=0; i--){
            rev+=b.charAt(i);
        }

        if (a.equals(rev)){
            System.out.println("\nPalindrome");
        }else {
            System.out.println("\nNot Palindrome ");
        }
        sc.close();
    }
}
