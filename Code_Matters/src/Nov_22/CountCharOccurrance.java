package Nov_22;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharOccurrance {
    public static void main(String[] args) {

        String a = "Java is a programming language";
        // Count the number of chars is repeated

        char ch[] = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 1;

        for (int i=0; i< ch.length; i++){
            if (!map.containsKey(ch[i])){

                map.put(ch[i], 1);
            }
            else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        for (Character c : map.keySet()){
            System.out.println(c +" = " + map.get(c));
        }
    }

}
