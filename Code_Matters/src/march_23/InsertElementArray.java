package march_23;

import java.util.Arrays;

public class InsertElementArray {
    public static void main(String[] args) {
        // insert an element in array based on index
        int[] arr = new int[] {22,45,77,90,100};
        System.out.println(Arrays.toString(arr));
        // insert element in 3rd position (index > 2 & element > 5)

        int index = 2;
        int value = 5;

        for (int i = arr.length-1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        System.out.println(Arrays.toString(arr));

    }
}
