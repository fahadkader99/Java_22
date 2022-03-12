package Challenging_Problem_1;

import java.util.Arrays;

public class RemoveElement {
    // Leetcode 27.

    public static void main(String[] args) {
        /*Input: nums = [3,2,2,3], val = 3
          Output: 2, nums = [2,2,_,_]*/

        // to delete an element i should know the index where the element is

        int[]nums = {1,2,3,4,5,6,7,8};
        int val = 3;


        RemoveElement el = new RemoveElement();
        System.out.println(el.removeElement(nums,val));

    }
    public int removeElement(int[] nums, int val){
        int i = 0;

        for (int j = 0; j< nums.length;j++){
            if (nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
