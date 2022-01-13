package practice2022.january.jan5;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {


        MapDemo m = new MapDemo();
        m.map1();

    }

    public void map1(){

        Map<Integer, String > map = new HashMap<>();
        map.put(1,"Ash");
        map.put(2,"kader");
        map.put(3,"Fahad");
        map.put(4, "Jahan");



        for (Integer key : map.keySet()){       // iterate over key only
            System.out.println(key);
        }

        for(Object value : map.values()){       // iterate over value only
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()){        // Iterate over key and value both.
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
        //System.out.println(map);

    }


}
