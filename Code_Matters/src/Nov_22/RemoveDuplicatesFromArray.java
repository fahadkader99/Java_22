package Nov_22;

import java.util.*;

public class RemoveDuplicatesFromArray {
    // remove the duplicates elements from array
    // Using Map
    public static void main(String[] args) {

        int[] arr= new int[]{1,2,3,4,5,1,2,4,5,5,5,5,7,8};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i=0; i< arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1 );
            }

        }
        List<Integer> list = new ArrayList<>();
        for (Integer e : map.keySet()){
            if ((map.get(e)>=1)){
                list.add(e);
            }
        }
        System.out.println(list);



    }
}
