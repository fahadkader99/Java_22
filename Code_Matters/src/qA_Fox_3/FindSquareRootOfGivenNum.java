package qA_Fox_3;

import java.util.Scanner;

public class FindSquareRootOfGivenNum {
    // find square root of a given num
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Square root of the num is: "+Math.sqrt(num));
    }
}
