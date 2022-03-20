package march_22;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        // leet 283;

        int arr[] = {1,0,2,0,1,3,1,4,5,6,0,6};      // move all the zeros to the right

        int count = 0;

        for (int i = 0; i< arr.length;i++){
            if (arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        for (int i = count; i< arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
