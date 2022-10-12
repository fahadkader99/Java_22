package a_practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateInArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3,4};

        Arrays.sort(arr);

        Set<Integer> set = new LinkedHashSet<>();

        for (int i=0; i < arr.length; i++ ){
            if (set.add(arr[i])==false){
                System.out.println("Duplicate " + arr[i] + " ");
            }
        }

    }
}
