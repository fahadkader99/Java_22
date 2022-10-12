package a_practice;

import java.util.Arrays;
import java.util.Map;

public class MaxMinArray {

    // find the max and min number in array
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        MaxMinArray a = new MaxMinArray();
        a.one(arr);
        a.two(arr);

    }

    void one(int[] arr){

        Arrays.sort(arr);

        System.out.println("The mim " + arr[0]);
        System.out.println("The max " + arr[arr.length-1]);
    }

    void two(int[] arr){

        int min = arr[0];
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }

        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
