package Nov_22;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsHashSet {
    // find the duplicate elements in array using hashset
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,1,2,3};
        Set<Integer> set = new HashSet<>();

        for (int i=0; i< arr.length; i++){
            if (set.add(arr[i])== false){
                System.out.println(arr[i] +" is duplicate");
            }
        }
    }
}
