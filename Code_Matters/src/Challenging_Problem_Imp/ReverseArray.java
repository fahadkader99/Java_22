package Challenging_Problem_Imp;

import java.util.Arrays;

public class ReverseArray {
    /*We can easily find two number in an array whose product is maximum using the below approach:

Sort the input integer array in descending order

multiply first and second element of the array, the product will be maximum.*/
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

//        Arrays.sort(arr);
//        System.out.println("After sorting: "+ Arrays.toString(arr));

        reverseArray(arr,arr.length);
        reverseArray2(arr);

    }
    public static void reverseArray(int[] arr, int length){

        int[] arr2 =new int[length];
        int j = length;

        for (int i = 0; i< length;i++){
            arr2[j-1] = arr[i];
            j--;
        }
        System.out.println("After reversing: "+ Arrays.toString(arr2));

    }
    public static void reverseArray2(int[] arr){

        int low = 0;
        int high = arr.length-1;

        while (low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println("After reverse: "+ Arrays.toString(arr));

    }
}
