package Nov_22;

import java.util.Arrays;

public class MaxMinArr {
    // find the max & min number in an aray
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,9,8,7,99};

        one(arr);
        two(arr);





    }

    public static void one(int[] arr){

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.println("Min " + min +"\nMax " + max);

    }

    public static void two(int[] arr){

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i<arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Min " + min +"\nMax " + max);
    }
}
