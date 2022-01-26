package common_Interview_Question;

import java.util.Scanner;

public class PalindromeNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();
        int original = num;



        // now reverse the number and compare with the original num!

        int reverse = 0;
        while (num>0){
            reverse = reverse*10+num%10;
            num = num/10;
        }
        System.out.println(reverse);

        if(original==reverse){
            System.out.println("palindrome");
        } else System.out.println("Not Palindrome. ");



    }

}
