package Nov_22;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharStr {
    // find the duplicate character in string

    public static void main(String[] args) {
        String a = "Fahad Kader";

        // with Set
          char[] ch = a.toCharArray();
//        Set<Character> set = new LinkedHashSet<>();
//
//        for (int i=0; i< ch.length; i++){
//            if (set.add(ch[i])==false){
//                System.out.println(ch[i]);
//            }
//        }

        // using map
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
            if (map.get(c) > 1){
                System.out.println(c +" " + map.get(c));
            }
        }
    }


}
