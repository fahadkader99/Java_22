package march_22;

import java.util.Scanner;

public class PalindromeNum {
    // find if the number is palindrom or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int num = sc.nextInt();
        int ori = num;
        int num2 = 0;

        while (num>0){
            num2 = num2*10+(num % 10);
            num = num / 10;

        }
        System.out.println(ori);

        if (ori==num2){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }




    }
}
