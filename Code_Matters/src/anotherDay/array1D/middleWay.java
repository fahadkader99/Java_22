package anotherDay.array1D;

import java.util.Arrays;

public class middleWay {
    /*
    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     */

    public static void main(String[] args) {

        int[]arr1 = {1,2,3};
        int[]arr2 = {4,5,6};

        int[]arr = new int[2];
        arr[0]=arr1[1];
        arr[1]=arr2[1];

        System.out.println(Arrays.toString(arr));


    }
}
