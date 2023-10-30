package november_22;

import java.util.Scanner;

public class RevNum {
    // Reverse a number by taking input from user

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int a = sc.nextInt();

        int b = a;

        int rev = 0;

        while (b != 0){
            int rem = b % 10;
            rev = (rev * 10) + rem;
            b = b/10;
        }

        System.out.println(rev);

        if (a==rev){
            System.out.println("\nPalindrome");
        }else {
            System.out.println("\nNot palindrome");
        }


    }

}
