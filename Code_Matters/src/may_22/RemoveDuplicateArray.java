package may_22;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
    // remove duplicates from array
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
