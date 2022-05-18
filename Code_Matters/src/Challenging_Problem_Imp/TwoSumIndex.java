package Challenging_Problem_Imp;

import java.util.ArrayList;
import java.util.List;

public class TwoSumIndex {
    // find two sum of the array and give their index.
    public static void main(String[] args) {

        int[]nums = {2,7,11,15};
        int target = 18;


        findTwoSum(nums, target);
    }
    public static void findTwoSum(int[] nums, int target){

        int[]arr = new int[5];
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i <nums.length; i++){
            for (int j = i+1; j <nums.length; j++){
                int index = target-nums[i];

                if (nums[j]==index){
                    //return new int[]{i,j};
                    list.add(i);
                    list.add(j);


                }
            }
        }
        System.out.println(list);
       // throw new IllegalArgumentException("No match found");
    }
 }
