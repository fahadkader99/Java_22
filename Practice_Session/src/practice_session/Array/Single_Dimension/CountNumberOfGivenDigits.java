package practice_session.Array.Single_Dimension;

import java.util.Scanner;

public class CountNumberOfGivenDigits {
    /*
    count the numbers of a given series
    input - 12345 . output - 5
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        method1(num);
        method2(num);

    }
    public static void method1(int num){    // using while loop
        int count = 0;
        while (num !=0){
            num =num/10;

            count++;
        }
        System.out.println(count);
    }
    public static void method2(int num){       // using string

        System.out.println(String.valueOf(num).length());


    }
}
