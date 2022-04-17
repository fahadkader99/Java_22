package april_Fool;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharString {
    // remove the duplicate character in a string:

    public static void main(String[] args) {

        String s = "Apple is awesome fruit, and people love it";

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i<s.length();i++){
            if (set.add(s.charAt(i))==false){
                set.add(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : set){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
