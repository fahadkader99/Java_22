package practice2022.january.jan2;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringAnagrams {
    //How do you check if two strings are anagrams of each other?
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1 = input.nextLine().toLowerCase();
        System.out.println("enter String 2: ");
        String str2 = input.nextLine().toLowerCase();

        boolean isSame = false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if (ch1.length != ch2.length){
            isSame = false;
        }else {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            isSame = Arrays.equals(ch1,ch2);
        }
        System.out.println(isSame);

        if (isSame){
            System.out.println( str1+" & "+ str2+ " are anagram.");
        }else {
            System.out.println(str1+ " & "+ str2+ " are not anagram. ");
        }



    }
}
