package march_april_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccuranceStr {
    // find the number of occurrance of char in a given string
    public static void main(String[] args) {
        System.out.println("\nEnter a String: ");
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a String: ");
        String a = sc.nextLine().trim().toUpperCase();
        sc.close();

        withMap(a);
    }

    static void withMap(String a){
        char[] str = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i< str.length;i++){
            if (!map.containsKey(str[i])){
                map.put(str[i], 1);
            }else {
                map.put(str[i], map.get(str[i])+1);
            }
        }

        // display logic
        for (Character c : map.keySet()){
            System.out.println(c +" = " + map.get(c));
        }
    }
}
