package march_april_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubStingNoRepeatingChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine().trim();
        sc.close();

        longestSubString(a);
    }

    static void longestSubString(String a){
        char[] str = a.toCharArray();
        String longestSubstring = "";
        int longestSubsStringLength = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i<str.length; i++){
            if (!map.containsKey(str[i])){
                map.put(str[i], i);
            }else {
                i = map.get(str[i]);
                map.clear();
            }

            if (map.size() > longestSubsStringLength){
                longestSubsStringLength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }




        System.out.println("\nLongest Substring without repeated char: " + longestSubstring +"\nLength: " + longestSubsStringLength);
    }

}
