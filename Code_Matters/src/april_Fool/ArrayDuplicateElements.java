package april_Fool;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicateElements {
    // find duplicate elements in array

    public static void main(String[] args) {
        String [] arr = {"a","b","c","a","b"};

        Map<String, Integer> map = new HashMap<>();

        int count = 0;
        for (int i = 0; i<arr.length;i++){
            if (map.containsKey(arr[i])==false){
                map.put(arr[i], count++ );
            }else {
                map.put(arr[i],map.get(arr[i])+1 );
            }
        }

        // printing
        for (String s : map.keySet()){
            if (map.get(s)>1){
                System.out.println(s+" = "+ map.get(s));
            }
        }
    }
}
