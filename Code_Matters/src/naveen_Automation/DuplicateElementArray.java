package naveen_Automation;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateElementArray {
    // find the duplicate elements from int array

    @Test
    void findDuplicate(){
        int[] arr = {1,2,4,5,6,3,4,5};
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        int count = 1;
        for (int i=0; i<arr.length; i++){
            if (map.containsKey(arr[i])==false){
                map.put(arr[i], count);
            }
            else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

//        for (Integer a : map.keySet()){
//            if (map.get(a)>1){
//                System.out.println("Duplicate element " + a);
//            }

        for (Integer a : map.keySet()){
            System.out.println(a + " = " + map.get(a));
        }
    }
}
