package pair_Program.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class String2 {
    //How do you print duplicate characters from a string?

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line with duplicate elements: ");
        String str = input.nextLine();

        char[] c = str.toCharArray();

        System.out.println("\nDuplicate elements are: ");
        Set<Character> set = new HashSet<>();

        for (char x : c){
            if (set.add(x)==false){
                System.out.println(x);
            }
        }

    }
}
