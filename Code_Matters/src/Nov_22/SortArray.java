package Nov_22;

import java.util.Arrays;

public class SortArray {
    // sort array using built in method
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,0,1};

        //Arrays.sort(arr);
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
