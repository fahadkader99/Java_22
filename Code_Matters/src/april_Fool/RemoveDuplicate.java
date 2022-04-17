package april_Fool;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // Remove Duplicate

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        removeDuplicateChar(s);

    }

    public static void removeDuplicateChar(String s) {

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : set){
            sb.append(c);
        }
        System.out.println(sb);


    }
}
