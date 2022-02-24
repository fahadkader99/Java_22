package qA_Fox;

import java.util.Scanner;

public class CountWordInString {
    // count number of words in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String[]s = str.split(" ");

        System.out.println("The num of word in the string are: "+ s.length);

    }
}
