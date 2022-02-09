package qA_Fox;

import java.util.Scanner;

public class CountNumOfDigits {

    // count the number of digits in a given number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int f = 0;
        while (num>0){
            num = num/10;
            count++;

        }
        System.out.println(count);

    }
}
