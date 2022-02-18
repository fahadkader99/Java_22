package qA_Fox;

import java.util.Scanner;

public class Compare2GivenNum {
    // compare 2 given num:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 num:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println(a+" is greater then "+ b);
        }else if (b>a){
            System.out.println(b+" is greater then "+ a);
        }else System.out.println("Bother are equal");

    }
}
