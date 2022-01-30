package talent_LMS;

import java.util.Scanner;

public class PassOrFail {
    /*
    Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50;
    or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.

Hints
Use >= for greater than or equal to comparison. Please fill out the dots with correct words.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int mark = sc.nextInt();

        if (mark >= 50){
            System.out.println("PASS");
        }else System.out.println("FAIL");

        System.out.println("\nDone");


    }
}
