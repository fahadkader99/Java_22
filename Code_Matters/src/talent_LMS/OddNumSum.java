package talent_LMS;

import java.util.Scanner;

public class OddNumSum {
    /*
    Write a program in Java to display the n terms of odd natural number and their sum.

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number up to 5 terms is: 25
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms: ");
        int terms = sc.nextInt();

        int sum = 0;

        for (int i =1; i<=terms;i++){
            System.out.println(2*i - 1);      // getting the odd num
            sum = sum+i;
        }

        System.out.println("The su of odd natural Num up to "+ terms+" terms is: "+ sum);

    }
}
