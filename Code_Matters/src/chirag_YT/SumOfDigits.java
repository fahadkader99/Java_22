package chirag_YT;

import java.util.Scanner;

public class SumOfDigits {
    // find sum of digits of a given number


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        int sum = 0;
        while (num>0){
            sum = sum+(num%10);
            num = num/10;
        }
        System.out.println(sum);


    }
}
