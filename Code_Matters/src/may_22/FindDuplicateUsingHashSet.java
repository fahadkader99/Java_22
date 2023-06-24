package may_22;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingHashSet {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,9};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i< arr.length;i++){

            if (set.add(arr[i])==false){
                System.out.println(arr[i]+" is duplicate");
            }
        }

        System.out.println("Array without duplicate: "+ set);
    }
}
