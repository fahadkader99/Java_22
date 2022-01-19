package chirag_YT;

import java.util.Scanner;

public class PalindromeNum {
    // Palindrome is a num that reads same from left to right and right to left

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();
        int original = num;

        int reverse = 0;
        while (num>0){
            reverse = reverse*10+(num%10);
            num = num/10;
        }
        //System.out.println(reverse);

        if (original==reverse){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");

        reverseNum(original);
    }
    public static int reverseNum(int original){
        int reverse = 0;
        //int original = num;
        while (original>0){
            reverse = reverse*10+(original%10);
            original = original/10;
        }
        System.out.println("Reverse of given Num is :"+ reverse);
        return reverse;
    }
}
