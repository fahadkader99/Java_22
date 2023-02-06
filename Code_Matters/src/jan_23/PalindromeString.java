package jan_23;

import java.util.Scanner;

public class PalindromeString {
    // palindrome string - should be same when it is reversed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String a = sc.nextLine().trim();
        sc.close();

        String b = a;
        String c = "";
        for (int i = b.length()-1; i >=0; i--){
            c+= b.charAt(i);
        }
        System.out.println(c);

        if (a.equals(c)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
