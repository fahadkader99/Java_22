package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicateArray {
    // remove duplicate element from array and return the array

// I SOLVED IT USING ARRAY LIST BUT NOT EFFICIENT
    public static void main(String[] args) {

        int[]arr = {1,2,3,3,4,5,6,6,7,8,9,7};
        List<Integer> list = new ArrayList<Integer>();


//        for (int i = 0; i <arr.length;i++){
//            list.add(arr[i]);
//        }
//
//
//
//        for (int i = 0; i < list.size();i++){
//            for (int j = i+1; j< list.size(); j++){
//                if (list.get(i)==list.get(j)){
//                    list.remove(j);
//                }
//            }
//        }
//        System.out.println(list);

        optimized();

    }
    public static void optimized(){
        // this is the optimized way of doing:
        int[] nums = {1,1,2,2,3};
        int index = 1;
        for (int i = 0; i <nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[index++]=nums[i+1];
            }
        }
        System.out.println(index);
    }
}
