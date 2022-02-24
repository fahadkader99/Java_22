package qA_Fox;

import java.util.Scanner;

public class FirstHalfOfString {
    // print first half of a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();


        String s = str.substring(0, str.length()/2);
        System.out.println("The first half is: "+ s);

        sc.close();
    }
}
