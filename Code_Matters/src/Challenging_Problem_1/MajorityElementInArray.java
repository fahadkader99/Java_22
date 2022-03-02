package Challenging_Problem_1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementInArray {
    // find the element that comes major times inside the array
    // Majority element: if an element appears more that [size of array /2] > called majority element
    /*
    ex: [10,20,10,10,20]    > size is 5 / 2 = 2.5. so which elements came more than 2.5 times is majority

    > If an element appears more that arraySize / 2 times that is called majority element
     */

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] a = {10,20,20,10,20};

        for (int i = 0; i <a.length; i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue()>a.length/2){
                int result = entry.getKey();
                System.out.println(result);
            }
        }



    }
}
