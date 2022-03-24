package Challenging_Problem_1;

public class SearchInsertPosition2 {
    // 35
    public static void main(String[] args) {
        /*Given a sorted array of distinct integers and a target value, return the index if the target is found.
         If not, return the index where it would be if it were inserted in order.
         You must write an algorithm with O(log n) runtime complexity.

Input: nums = [1,3,5,6], target = 5
Output: 2
         */
        int[] nums ={1,3,5,6};              // if the target element is less than 1 then return the 0 index and if it is larger than last element then return arr.lenghtn -1.
        int target  = 5;

        // we need to use the binary search approach.


        System.out.println(findIndex(nums,target));     // but it is the wrong answer !!

    }
    public static int findIndex(int[] nums, int target){
        int index = 0;

        for (int i = 0; i<nums.length;i++){
            if (nums[i] == target){
                target = i;
                break;
            }
        }
        return target;
    }
}
