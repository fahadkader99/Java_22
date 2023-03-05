package jan_23;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateArra {
    // find the duplicate elements in array
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,1,2,3};

        dup1(arr);
        dup2(arr);


    }

    static void dup1(Integer[] arr){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1 );
            }
            else {
                map.put(arr[i], map.get(arr[i]) +1 );
            }
        }

        for (Integer e : map.keySet()){
            if (map.get(e) > 1){
                System.out.println(e + " = " + map.get(e));
            }
        }
    }

    static void dup2(Integer[] arr){
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++){
            if (set.add(arr[i])==false){
                System.out.println("Dup " + arr[i]);
            }
        }


    }
}
