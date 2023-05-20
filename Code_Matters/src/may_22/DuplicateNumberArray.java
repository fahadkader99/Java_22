package may_22;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateNumberArray {
    // find the duplicate Numbers in array

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,5,6,7};            // remember, it is better tho have to sorted always

        findDuplicate(arr);
    }
    public static void findDuplicate(int[] arr){
        int count = 1;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i< arr.length;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1 );
            }
        }

        // Condition

        for (Integer a : map.keySet()){                     // if key is repeated more than 1 only them print out...! [not the value]
            if (map.get(a)>1){
                System.out.println(a+ "= "+ map.get(a));
            }
        }
    }
}
