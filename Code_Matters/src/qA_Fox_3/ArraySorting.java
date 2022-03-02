package qA_Fox_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySorting {
    // sort the array in 2 ways using built in methods

    public static void main(String[] args) {

        ascending();
        descending();

    }
    public static void ascending(){
        int[]num = {6,2,8,1,4,3,5};

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));
    }
    public static void descending(){
        Integer []num1 = {8,3,1,5,2,7,3,4,9};
        Arrays.sort(num1, Collections.reverseOrder());
        System.out.println(Arrays.toString(num1));
    }
}
