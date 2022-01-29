package c_Bat.array1;

import java.util.Arrays;

public class swapEnds {
    /*
    Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
     */

    public static void main(String[] args) {

        int [] arr = {4, 2, 3, 1};

        int a = arr[0];
        int b = arr[arr.length-1];

        for (int i = 1; i<arr.length;i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = a;
        arr[0] = b;

        System.out.println(Arrays.toString(arr));
    }

}
