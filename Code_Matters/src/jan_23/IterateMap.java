package jan_23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IterateMap {
    // iterate through the hashmap
    public static void main(String[] args) {            // remember maps do not deal with primitives & if i call a map with key, it will return value

        Map<String , Integer> map = new LinkedHashMap<>();
        map.put("Fahad", 1);
        map.put("Sania", 2);
        map.put("Esrat", 3);
        map.put("Ahad", 4);
        map.put("Ayesha", 5);

        for (Map.Entry<String , Integer> entry: map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print("\nKey " + key);
            System.out.print(" Value: " + value);
        }
    }
}
