package may_22;

import java.util.ArrayList;
import java.util.List;

public class ArrayMaxFun {
/*
Given an array of ints length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
 */

    public static void main(String[] args) {
        int[] array = {1,2,3};
        int max = array[0];

        for (int i = 0; i<array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<3;i++){
            list.add(max);
        }
        System.out.println(list);
    }
}
