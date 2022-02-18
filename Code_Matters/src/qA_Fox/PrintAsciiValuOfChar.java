package qA_Fox;

import java.util.Scanner;

public class PrintAsciiValuOfChar {
    // print the ascii value of the given char

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char:");
        char ch = sc.next().charAt(0);

        int a = (int) ch;

        System.out.println("THe ascii value of the char is: "+ a);
    }
}
