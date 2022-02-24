package qA_Fox;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RightRotateBy3Element {
    public static void main(String[] args) {
        // right rotate the array by 3 elements

        int []arr = {1,2,3,4,5,6};
        int size = arr.length;
        int n = 3;

        for (int j = 1; j<=n;j++){

            int last = arr[size-1];

            for (int i = size-1; i>0; i--){
                arr[i]= arr[i-1];
            }
            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));
        leftRotation1(arr);
    }
    public static void leftRotation1( int[] arr){

        int first = arr[0];

        for (int i = 1; i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;

        System.out.println(Arrays.toString(arr));
    }
}
