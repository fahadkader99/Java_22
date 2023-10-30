package november_22;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharFromString {
    // Input a String & find out the duplicate char with number of time
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String a = sc.nextLine().trim().toLowerCase();
        sc.close();

        char[] ch = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i< ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }
            else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        for (Character c : map.keySet()){
            if (map.get(c) > 1){                                // This condition is for repeated char > 1
                System.out.println(c +" = " + map.get(c));
            }
        }
    }
}
