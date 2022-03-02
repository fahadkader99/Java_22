package qA_Fox_3;

import java.util.Arrays;

public class Swap2NumInArray {
    // swap two number in the array, first with the last one
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1]= temp;




        System.out.println(Arrays.toString(arr));

    }
}
