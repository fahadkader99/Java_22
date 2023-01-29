package Nov_22;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWithSet {
    // find the duplicate element using set
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,3,4,5,6,7};
        Set<Integer> set = new LinkedHashSet<>();

        for (int i =0; i< arr.length; i++){
            if (set.add(arr[i])==false){
                System.out.println(arr[i] +" is Duplicate");
            }
        }
    }
}
