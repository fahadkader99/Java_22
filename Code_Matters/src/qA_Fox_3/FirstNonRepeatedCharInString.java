package qA_Fox_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharInString {
    // find the first non- repeated char in a string ----------- ex: amazon - m
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine().toLowerCase();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }

        }

        boolean isDup = false;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println("1st non-repeated char: " + ch);
                isDup = true;
                break;
            }

        }
        if (!isDup ) {
            System.out.println("No non-repeated char found...Try again..!");
        }


    }
}
