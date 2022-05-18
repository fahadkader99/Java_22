package May;

import java.util.Arrays;
import java.util.Collections;

public class Filter_Array {

    public static void main(String[] args) {
        // filter the given array

        String[] input = {"Monday", "Tuesday","Wednesday","Thursday","Friday"};

        String[] result = new String[input.length];

        for (int i = 0; i<input.length;i++){

            result[i] = input[i].substring(0,3);
        }
        System.out.println(Arrays.toString(result));

    }
}
