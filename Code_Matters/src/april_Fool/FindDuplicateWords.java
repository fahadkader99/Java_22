package april_Fool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWords {
    // find the duplicate words in a string

    public static void main(String[] args) {
        String a = "I am Fahad I am from NY";
        String [] arr = a.split("\\s+");
        System.out.println(Arrays.toString(arr));

        int count = 1;

        Map<String , Integer> map = new HashMap<>();

        for (int i = 0; i< arr.length; i++){

            if (map.containsKey(arr[i])==false){
                map.put(arr[i], count);
            }else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
//        // print
//        for (String s : map.keySet()){
//            System.out.println(s+" = "+ map.get(s));
//        }

        // find duplicate:
        for (String s : map.keySet()){
            if (map.get(s)>1){
                System.out.println(s+" =  "+ map.get(s));
            }
        }


    }
}
