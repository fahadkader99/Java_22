package qA_Fox_3;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArrayUsingHashSet {
    // find the duplicate elements in the array using hash set

    public static void main(String[] args) {
        int[] num = {1,1,2,2,3,3,4,4,5,5,5,6,7,8,9,0,6,6,4,5,8};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i< num.length;i++){
            if (set.add(num[i])==false){
                System.out.println(num[i]+" is duplicate element");
            }
        }
    }
}
