package practice2022.january.jan2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharInString {
    //How do you print duplicate characters from a string?
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        char[] ch = str.toCharArray();

        System.out.println("Duplicate char: ");
        Set<Character> set = new HashSet<>();

        for (Character x : ch){
            if (set.add(x)==false){
                System.out.println(x);
            }
        }

    }
}
