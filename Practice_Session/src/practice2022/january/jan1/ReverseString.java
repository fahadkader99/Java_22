package practice2022.january.jan1;

import java.util.Scanner;

public class ReverseString {
    // reverse a string.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a String: ");
        String s = input.nextLine();

        String str = "";

        for (int i = 0; i < s.length(); i++){
            str = s.charAt(i)+str;
        }

        System.out.println("REverse: "+ str);


    }
}
