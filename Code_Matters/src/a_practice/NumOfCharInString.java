package a_practice;

import java.util.Scanner;

public class NumOfCharInString {

    // find the number of char in a string

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String a = sc.nextLine().trim();

        char[] ch = a.toCharArray();
        System.out.println("The number of character int he Sting " + ch.length);
    }
}
