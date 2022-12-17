package Nov_22;

import java.util.Scanner;

public class PalindromeNumber {
    // check the given number is palindrome or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int a = sc.nextInt();
        int b = a;
        sc.close();

        int rev = 0;
        while (b !=0){
            int rem = b %10;
            rev = (rev *10)+rem;
            b = b/10;
        }

        if (a==rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }



    }
}
