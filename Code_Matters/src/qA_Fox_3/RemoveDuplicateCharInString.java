package qA_Fox_3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharInString {
    // remove the duplicate char in string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with duplicate char: ");
        String str = sc.nextLine();

        removeDup(str);
    }
    public static void removeDup(String str){
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0;i<str.length();i++){
            set.add(str.charAt(i));
        }

        StringBuilder s = new StringBuilder();
        for (Character c : set){
            s.append(c);
        }
        System.out.println("New String: "+ s);
    }
}
