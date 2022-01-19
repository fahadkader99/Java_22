package chirag_YT;

import java.util.Scanner;

public class PalindromeNumOrNot {
    // find out given number is Palindrome or not.
    // Palindrome num: number remains same when reversed. ex: 121.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = s.nextInt();
        int original = num;
        int reverse = 0;
        int lasDigit=0;

        while (num>0){
            lasDigit =(num%10);
            reverse = reverse*10 + lasDigit;
            num = num/10;
        }
//        System.out.println(reverse);
//        System.out.println(original);

        if(original == reverse){
            System.out.println("Palindrome Num");
        }else System.out.println("Not Palindrome...!");


    }

}


