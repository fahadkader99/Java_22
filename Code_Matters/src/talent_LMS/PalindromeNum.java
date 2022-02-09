package talent_LMS;

import java.util.Scanner;

public class PalindromeNum {
    // check if the number is palindrome

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();

        int original = num;
        int r = 0;
        int rev = 0;

        while (num>0){
          r = num %10;
          num = num/10;
          rev= rev *10 + r;
        }
        System.out.println(rev);

        if (original==rev){
            System.out.println("Palindrome");
        }else System.out.println("Not palindrome");


    }
}
