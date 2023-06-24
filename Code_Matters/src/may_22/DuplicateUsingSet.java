package may_22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSet {
    // find the duplicates using hash set

    public static void main(String[] args) {
        int[] arr = {2,5,6,7,11,8,2,9,7,11};

        DuplicateUsingSet set = new DuplicateUsingSet();
        set.findDuplicateWithSet(arr);

    }
    public void findDuplicateWithSet(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i<arr.length;i++){
            if (set.add(arr[i])==false){
                System.out.println(arr[i]);
            }
        }

    }
}
