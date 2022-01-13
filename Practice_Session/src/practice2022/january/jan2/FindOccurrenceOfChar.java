package practice2022.january.jan2;

import java.util.Scanner;

public class FindOccurrenceOfChar {
    //How do you count the occurrence of a given character in a string?
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        System.out.println("Enter the char: ");
        char ch = input.next().charAt(0);

        int count = 0;

        for (int i =0; i< s.length();i++){
            if (s.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Occurrence "+count);


    }
}
