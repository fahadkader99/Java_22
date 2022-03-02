package Challenging_Problem_1;

import java.util.Scanner;

public class PalindromeNumber {
    // find a palindrome number or not, a number that reads same from both side.
    //ex: 121 / 111

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int original = num;

        int last = 0;
        int reverse = 0;

        while (num>0){
            last = num%10;
            reverse = reverse*10+last;
            num = num/10;
        }
        //System.out.println(reverse);

        if (original==reverse){
            System.out.println("Palindrome");
        }else System.out.println("Not");



    }
}
