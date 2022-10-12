package a_practice;

import java.util.Scanner;

public class ReverseWordInStr {
    // reverse every word in a line
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine().toLowerCase().trim();
        sc.close();

        //String a = "Fahad Kader";

        String [] words = a.split(" ");
        String reverseString = "";


        for (String w: words){

            String reverseWord = "";

            for (int i=w.length()-1; i>=0; i--) {
                reverseWord = reverseWord+ w.charAt(i);
            }
            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println("Reversed: " + reverseString);





    }
}
