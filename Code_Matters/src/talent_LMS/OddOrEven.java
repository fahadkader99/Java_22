package talent_LMS;

import java.util.Scanner;

public class OddOrEven {
    /*
    Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
    The program shall always print “bye!” before exiting.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");

        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Even Num");
        }else System.out.println("Odd Num");

        System.out.println("\nDone");

    }
}
