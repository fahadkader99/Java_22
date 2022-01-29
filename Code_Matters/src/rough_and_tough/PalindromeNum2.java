package rough_and_tough;

import java.util.Scanner;

public class PalindromeNum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();
        int ori = num;

        int rev = 0;

        while (num>0){
            rev = rev*10+num%10;
            num = num/10;

        }
        //System.out.println(rev);

        if (ori==rev){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");

    }
}
