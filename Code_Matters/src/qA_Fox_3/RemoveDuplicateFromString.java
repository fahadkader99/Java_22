package qA_Fox_3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromString {
    // java program to remove duplicate character from string
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        Set<Character>set = new LinkedHashSet<>();

        for (int i = 0; i<str.length();i++){
            set.add(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : set){
            sb.append(c);
        }
        System.out.println("New string "+ sb);
    }
}
