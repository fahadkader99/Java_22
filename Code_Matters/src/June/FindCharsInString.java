package June;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindCharsInString {

    public static void main(String[] args) {
        // find the number of char in a string
        String str = "I BOUGHT A NEW LEXUS IS 350 F STORT TODAY, IT IS AMAIZING CAR";


        findChar(str);
    }
    public static void findChar(String a){
        char[] ch = a.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 1;

        for (int i = 0; i<ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], count);
            }
            else {
                map.put(ch[i], map.get(ch[i])+ 1);
            }
        }


        for (Character c: map.keySet()){
            System.out.println(c + " = "+ map.get(c));
        }
    }
}
