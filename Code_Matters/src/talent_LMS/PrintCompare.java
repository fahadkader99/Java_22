package talent_LMS;

import java.util.Scanner;

public class PrintCompare {
    /*
    Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output


25 < 39     or       39 > 25        or       "The fist number is smaller"
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd Num");
        int n2 = sc.nextInt();


        if(n1<n2){
            System.out.println(n1+" < "+n2 + "   or   "+ n2+" > "+n1+"   or   "+" 1st Num is smaller ");
        }else {
            System.out.println(n1+" > "+n2 + "   or   "+ n2+" < "+n1+"   or   "+" 2nd Num is smaller ");
        }

    }
}
