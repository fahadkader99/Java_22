package qA_Fox;

import java.util.Scanner;

public class SumDigitsOfGivenNumber {

    // sum up the digits of a given number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int remainder = 0;
        int sum = 0;

        while (num>0){
            remainder = num %10;
            sum = sum+remainder;
            num = num/10;
        }
        System.out.println(sum);

    }
}
