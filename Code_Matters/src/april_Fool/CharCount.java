package april_Fool;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    // count all the char in a string
    public static void main(String[] args) {
        String s = "My name is Fahad. I am from New York. I live in New York CIty";
       // String s = "Fahad";

        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;

        for (int i = 0; i<ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], count);
            }else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        for (Character c: map.keySet()){
            System.out.println(c+" = "+ map.get(c));
        }
    }
}
