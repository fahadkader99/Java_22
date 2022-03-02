package rough_and_tough_2;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int []arr = {0,1,2,3,4,5,6,7};
        int target = 3;

        int[]arr2 = new int[arr.length];

        for (int i = 0; i<arr.length-1;i++){
            for (int j = i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    arr2[0]=arr[i];
                    arr2[1]=arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr2));


    }
}
