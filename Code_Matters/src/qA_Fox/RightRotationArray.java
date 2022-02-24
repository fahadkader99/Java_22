package qA_Fox;

import java.util.Arrays;

public class RightRotationArray {
    // right rotate array by 1 element
    public static void main(String[] args) {
        int []  arr  = {1,2,3,4,5};

        int size = arr.length;
        int last = arr[size-1];

        for (int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));

    }


}
