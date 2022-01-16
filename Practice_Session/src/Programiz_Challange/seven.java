package Programiz_Challange;

import java.util.Scanner;

public class seven {
    //Java Program to Check Whether a Number is Even or Odd
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = s.nextInt();

        if(num%2==0){
            System.out.println("Even");
        }else System.out.println("Odd");


    }
}
