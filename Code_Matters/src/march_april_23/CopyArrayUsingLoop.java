package march_april_23;

import java.util.Arrays;

public class CopyArrayUsingLoop {
    // copy an array by iterating the array
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i< arr.length; i++){
        arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
