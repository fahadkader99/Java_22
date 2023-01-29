package jan_23;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArr {
    // reverse an array

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        Integer[] a = new Integer[]{10,20,30,40};

        // one(arr);
        two(a);

    }

    static void one(int[] arr ){

        int length = arr.length;
        int halfLength = length/2;

        for (int i = 0; i < halfLength; i++){
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

    static void two(Integer[] arr){
        Collections.reverse(Arrays.asList(arr));

        System.out.println(Arrays.toString(arr));
    }
}
