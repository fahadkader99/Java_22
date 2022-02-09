package talent_LMS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWithHashSet {
    // program to remove duplicate from Array using hash Set

    public static void main(String[] args) {

        int[] arr = {1,3,2,2,6,7,3,5,1,8,9,0};
        System.out.println("Original array: "+Arrays.toString(arr));

        //deleteDuplicate(arr);
        findDuplicate(arr);


    }
    public static void deleteDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i<arr.length;i++){
            set.add(arr[i]);
        }


        System.out.println("After deleting duplicate: "+set);
    }
    public static void findDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i<arr.length;i++){
            if (set.add(arr[i])==false){
                System.out.println("Duplicate: "+ arr[i]);
            }
        }
    }
}
