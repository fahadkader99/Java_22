package may_22;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurrenceOfCharInString {
    // fin the number of time a char occurrence in a string

    public static void main(String[] args) {

        String a = " Java programming Java oops";

        char[] arr = a.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 1;

        for (int i = 0; i< arr.length;i++){

            if (!map.containsKey(arr[i])){

                map.put(arr[i], count);
            }
            else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }


        // now printing
        for (char c : map.keySet()){
            if (map.get(c) > 1){
                System.out.println(c+" = "+ map.get(c));
            }
        }





    }

}
