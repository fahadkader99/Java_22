package June;

import java.util.HashMap;
import java.util.Map;

public class FindOccuranceOfChar {

    // find the occurance of character in string

    public static void main(String[] args) {

        char1();
    }
    public static void char1(){
        String a = "My name if ASHIKUL KADER FAHAD, people call me FAHAD";

        char[] ch = a.toCharArray();
        int count = 1;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i<ch.length; i++){

            if (!map.containsKey(ch[i])){

                map.put(ch[i], count);
            }
            else {
                map.put(ch[i], map.get(ch[i])+ count);
            }
        }

        for (Character c: map.keySet()){
            System.out.println(c +" = " + map.get(c));
        }
    }
}
