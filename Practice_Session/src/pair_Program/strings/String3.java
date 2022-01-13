package pair_Program.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        //How do you check if two strings are anagrams of each other?

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string-1: ");
        String str1 = input.nextLine().toLowerCase();
        System.out.println("Enter string-2: ");
        String str2 = input.nextLine().toLowerCase();
        boolean isSame = false;

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        if (c1.length != c2.length){
            isSame = false;
        }else {
            Arrays.sort(c1);
            Arrays.sort(c2);
            isSame = Arrays.equals(c1,c2);
        }
        System.out.println(isSame);

        if (isSame){
            System.out.println(str1 +" and "+ str2 + " are anagrams ");
        }else {
            System.out.println(str1 + " and "+ str2 + " Not anagram !");
        }

    }
}
