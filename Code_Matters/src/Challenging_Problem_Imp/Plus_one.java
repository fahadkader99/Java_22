package Challenging_Problem_Imp;

import java.util.Arrays;

public class Plus_one {
    /*
    * leetCode - 66
    *
    * Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
    *  */


    public static void main(String[] args) {
    // so if the last digit is not 9 then we will just increment the last digit, if it is 9 then we need to resize the array & have to add extra digit

        int[] arr = {4, 3, 2, 1};

        int[] n = plusOne(arr);
        System.out.println(Arrays.toString(n));

    }
    public static int[] plusOne(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] result = new int[arr.length + 1];
        result[0] = 1;


        return result;
    }
}
