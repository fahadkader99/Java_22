package may_22;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicates {
    // find duplicates suing hashset
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,3,1,3};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        int count = 1;

        for (int i = 0; i< arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], count);
            }
            else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        // print
        for (Integer k : map.keySet()){
            if (map.get(k) > 1){
                System.out.println(k+" "+ map.get(k));
            }
        }


    }
}
