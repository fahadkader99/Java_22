package march_april_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithOutRepeatingChar {
    // find the longest substring without repeating character
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine().trim();
        sc.close();

        LongestSubstringWithOutRepeatingChar longest = new LongestSubstringWithOutRepeatingChar();
        longest.longestSubstring(str);


    }
    public void longestSubstring(String str){
        if (str.length() <= 1){
            System.out.println("\nLongest Substring: " + str);
        }

        String longestSubstring = null;
        int longestSubstringLength = 0;

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        char[] arr = str.toCharArray();

        for (int i = 0; i<arr.length;i++){
            char ch = arr[i];

            if (!map.containsKey(ch)){
                map.put(ch, i);
            }else {
                i = map.get(ch);                                                    // if map already contains the key > then replacing the map value with the previous value of the key
                map.clear();                                                        // since I don't want the repeated char & after replacing i value with previous repeated value > so if repeated char found then it will clear the value
            }

            if (map.size() > longestSubstringLength){
                longestSubstringLength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }

        System.out.println("\nLongest Substring: " + longestSubstring);
        System.out.println("Length: " + longestSubstringLength);



    }
}
