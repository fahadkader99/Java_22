package practice_session.Array.Single_Dimension;

import java.util.Scanner;

public class SumOfDigits {
    /*
    print sum of digit of a given num
    input- 123 > output - 6
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num > 0){
            sum = sum+(num%10);
            num = num/10;
        }
        System.out.println("Sum "+ sum);

    }
}
