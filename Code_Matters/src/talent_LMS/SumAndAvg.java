package talent_LMS;

import java.util.Scanner;

public class SumAndAvg {
    /*
    Write a program in Java to input 5 numbers from keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :

Input the 5 numbers :
1
2
3
4
5
The sum of 5 no is : 15
The Average is : 3.0
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 num: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        int sum = n1+n2+n3+n4+n5;
        int avg = sum / 5;

        System.out.println("Sum "+ sum);
        System.out.println("Avg: "+ avg);



    }
}
