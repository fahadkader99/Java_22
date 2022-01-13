package practice2022.january.jan2;

import java.util.Scanner;

public class ReverseString {
    //How do you reverse a given string in place?
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = Input.nextLine();

        String empty = "";

        for (int i = 0; i < str.length(); i++){
            empty = str.charAt(i)+empty;
        }
        System.out.println("Reversed "+ empty);

    }
}
