package april_Fool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordNumber {

    public static void main(String[] args) {
        String s = "My name is Fahad. I am from New York. I live in New York CIty";

        String[]str = s.split("\\s+");

        System.out.println(Arrays.toString(str));

        Map<String, Integer> map = new HashMap<>();
        int count = 1;

        for (int i = 0; i< str.length;i++){
            if (!map.containsKey(str[i])){
                map.put(str[i], count);
            }else {
                map.put(str[i], map.get(str[i])+1);
            }
        }

        // printing
        for (String t : map.keySet()){
            System.out.println(t+" = "+ map.get(t));
        }

    }
}
