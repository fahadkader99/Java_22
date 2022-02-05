package algo.twoSumIndex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIndex {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 18;            // return [1,2] - index;

        //System.out.println(Arrays.toString(twoSumBruteForce(arr,target)));    // bruteForce - 0(n^2)

        System.out.println(Arrays.toString(twoSumHashMap(arr,target)));      // using HashMap - 0(n)

    }
    public static int[] twoSumBruteForce(int[]arr, int target){

        for (int i = 0; i<arr.length;i++){

            for (int j = i+1; j<arr.length;j++){

                if (arr[j]==(target-arr[i])){
                    return new int[]{i,j};
                }
            }
        }
        throw  new IllegalArgumentException("No pair found");
    }

    public static int[] twoSumHashMap(int[]arr, int target){
       Map<Integer, Integer> map = new HashMap<>();

       for (int i = 0; i<arr.length;i++){
           int complement = target - arr[i];
           if (map.containsKey(complement)){
               return new int[]{map.get(complement), i};
           }

           else {
               map.put(arr[i],i);
           }
       }
        throw  new IllegalArgumentException("No pair found");


    }

}
