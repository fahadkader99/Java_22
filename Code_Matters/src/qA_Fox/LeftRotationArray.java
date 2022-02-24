package qA_Fox;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotationArray {
    // left rotation of array by 1 element
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};

        int first = arr[0];
        for (int i = 1; i<arr.length;i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = first;
        for (int x : arr){
            System.out.print(x+" ");
        }

    }
}
