package jan_23;

import java.util.*;

public class MapToList {
    // convert a hashmap to arrayList
    public static void main(String[] args) {

        Map<String , Integer > map = new HashMap<>();
        map.put("Fahad", 1);
        map.put("Kader", 2);
        map.put("Jahan", 3);


        for (Map.Entry<String , Integer > entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
        }

        // conversion
        List<String> str = new ArrayList<>(map.keySet());
        List<Integer> num = new ArrayList<>(map.values());

        System.out.println(str);
        System.out.println(num);



    }
}
