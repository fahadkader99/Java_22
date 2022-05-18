package May;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateUsingSet {
    // find the duplicates in array using set

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i< arr.length;i++){
            if (set.add(arr[i])==false){
                System.out.println(arr[i]);
            }
        }
        System.out.println(set);
    }
}
