package Challenging_Problem_1;

import java.util.Arrays;

public class SwapFirstAndLastElementArray {
    // swap first and last element in the array;
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        int temp;
        int size = a.length;

        temp = a[0];
        a[0] = a[size-1];
        a[size-1] = temp;

        System.out.println("AFTER SWAP: "+ Arrays.toString(a));


    }
}
