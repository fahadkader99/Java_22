package may_22;

import java.util.Arrays;

public class SortArray_WithoutBuildIn {
    // sort the array without build in method

    public static void main(String[] args) {

        int[] array = {1,2,6,5,3,4};

        for (int i = 0; i< array.length;i++){

            for (int j = i+1; j< array.length;j++){

                if (array[i] > array[j]){           // swap elements if not in order
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
