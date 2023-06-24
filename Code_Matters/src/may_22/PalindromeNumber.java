package may_22;

import java.util.Scanner;

public class PalindromeNumber {

    // check the number is palindrome or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        int num2 = num;
        int reversedNum = 0;

        while (num2!=0){
            int rem = num2%10;
            reversedNum = (reversedNum*10) + rem;
            num2 = num2/10;
        }

        if (num==reversedNum){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Pal");
        }

    }
}
