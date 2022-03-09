package march_22;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    // sort array ascending and descending order
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,6,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] a1 = {1,2,3,4,5,6,};
       Arrays.sort(a1,Collections.reverseOrder());
        System.out.println(Arrays.toString(a1));
    }
}
