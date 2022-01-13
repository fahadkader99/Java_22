package pair_Program.others;

import java.util.Scanner;

public class PalindromeOfNum {
    // find palindrome of a number:
    // when a num read from left is == num read from right
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = s.nextInt();

        int originalNum = num;


        // now i have to reverse the num, follow the number reverse method

        int reverse = 0;
        int lastDigit = 0;

        while (num > 0){
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        //System.out.println(reverse);      // > now we will check the reverse num with original num


        if (originalNum == reverse){
            System.out.println(originalNum+ " is Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }



    }
}
