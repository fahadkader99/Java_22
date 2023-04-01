package jan_feb_23;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        // Remove duplicate elements from array

        int[] arr = {1,2,3,4,5,4,3,2};

        usingSet(arr);

    }

    static void usingSet(int[] arr ){
        Set<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i< arr.length; i++){
            if (set.add(arr[i]) == false){
                System.out.println(arr[i]);
            }
        }

        System.out.println("\nWithout Duplicate: " + set);
    }
}
