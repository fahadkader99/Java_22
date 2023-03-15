package march_23;

import java.util.Arrays;

public class SortArray {
    // write a program to sort Numeric & String array
    public static void main(String[] args) {
        int[] arr = new int[] {5,3,4,6,1};
        String [] str = new String[] {"C", "A", "D", "B"};

        Arrays.sort(arr);
        Arrays.sort(str);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
    }
}
