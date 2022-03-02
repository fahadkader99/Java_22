package qA_Fox_3;

import java.util.Scanner;

public class InsertAWordInMidText {
    // insert a word in the middle of given text

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        sc.close();

        String n = str.substring(0,str.length()/2)+" hi "+ str.substring(str.length()/2);
        System.out.println(n);


    }
}
