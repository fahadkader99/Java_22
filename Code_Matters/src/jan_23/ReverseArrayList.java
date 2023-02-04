package jan_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        // reverse an array List

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int[] arr = new int[]{1,2,3,4,5,6};

        //one(list);
        two(arr);


    }

    static void one(List<Integer> list){
        Collections.reverse(list);
        System.out.println(list);
    }

    static void two(int[] arr){

        int length = arr.length;
        int halfLength = length/2;

        for (int i = 0; i < halfLength; i++){
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));


    }

}
