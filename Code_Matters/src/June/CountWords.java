package June;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

    // count the words in a string

    public static void main(String[] args) {
        String s  = "My name is Fahad and people call me Fahad";

        String[] str = s.split("\\s+");
        //System.out.println(Arrays.toString(str));

        Map<String, Integer> map = new HashMap<>();
        int count = 1;

        for (int i = 0; i< str.length; i++){

            if (!map.containsKey(str[i])){

                map.put(str[i], count);
            }
            else {
                map.put(str[i], map.get(str[i]) + 1);
            }
        }

        for (String x : map.keySet()){
            System.out.println(x + " = " + map.get(x));
        }


    }

}
