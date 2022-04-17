package april_Fool;

import java.util.Arrays;

public class ArrayTargetSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,4,6};
        int target = 5;

        System.out.println(Arrays.toString(targetSum(arr, target)));

    }
    public static int[] targetSum(int[] arr, int target){

        for (int i=0; i<arr.length;i++){

            for (int j = i+1; j<arr.length; j++){

                if (arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }

        throw new IllegalArgumentException("No pair Found");

    }
}
