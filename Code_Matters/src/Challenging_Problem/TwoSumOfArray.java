package Challenging_Problem;

import java.util.ArrayList;
import java.util.List;

public class TwoSumOfArray {
    // find to sum to the number of array
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 3;

        List<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i <arr.length-1;i++){
            for (int j = i+1; j <arr.length;j++){
                if (arr[i]+arr[j]==target){
                    arr1.add(arr[i]);
                    arr1.add(arr[j]);
                }
            }
        }
        System.out.println(arr1);

    }
}
