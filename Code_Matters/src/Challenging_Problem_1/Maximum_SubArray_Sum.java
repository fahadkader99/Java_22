package Challenging_Problem_1;

// leetcode - 53
public class Maximum_SubArray_Sum {
    /*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

    A subarray is a contiguous part of an array.

    Example 1:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.

    Example 2:
    Input: nums = [1]
    Output: 1

    Example 3:
    Input: nums = [5,4,-1,7,8]
    Output: 23

    * */
    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};                   // Sub-array : is an array inside another array, and it should be contiguous


        System.out.println(maxSbArraySum(arr));
    }
    public static int maxSbArraySum(int[]arr){          // Kadane's algorithm -- most efficient.
        int maxSum = arr[0];
        int sum = arr[0];

        for (int i = 1; i<arr.length;i++){

            if (sum < 0){
                sum = arr[i];

            }else {
                sum = sum + arr[i];
            }

            maxSum = Math.max(sum, maxSum);

        }

        return maxSum;
    }
}
