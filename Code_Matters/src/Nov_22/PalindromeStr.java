package Nov_22;

import java.util.Scanner;

public class PalindromeStr {
    // Check if the given string is palindrome or not {if left to right & right to left reads same}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String a = sc.nextLine().trim().toLowerCase();
        String b = a;
        sc.close();

        PalindromeStr pal = new PalindromeStr();
        String alter = pal.palindrome1(b);

        if (b.equals(alter)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


    }
    String  palindrome1(String str){
        String c = "";
        for (int i = str.length()-1; i>=0; i--){
            c+=str.charAt(i);
        }
        return c;

    }
}
