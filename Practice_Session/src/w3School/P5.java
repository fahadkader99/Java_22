package w3School;

import java.util.Scanner;

public class P5 {
    /*
     Write a Java program that takes three
     numbers as input to calculate and print the average of the numbers
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, n3, ave;
        System.out.println("1st Number: ");
        n1 = input.nextInt();

        System.out.println("2nd Number: ");
        n2 = input.nextInt();

        System.out.println("3rd number: ");
        n3 = input.nextInt();

        ave = (n1 + n2 + n3) / 3;
        System.out.println("The average is: " + ave);

    }
}
