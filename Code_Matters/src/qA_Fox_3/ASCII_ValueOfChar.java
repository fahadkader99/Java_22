package qA_Fox_3;

import java.util.Scanner;

public class ASCII_ValueOfChar {
    // find the ascii value of the given char
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a char: ");
            char ch = sc.next().charAt(0);

            System.out.println("ASCII value of the given char is: "+(int)ch);
        }catch (Exception e){
            System.out.println("Exception found try again ");
        }
    }
}
