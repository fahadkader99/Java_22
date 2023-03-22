package march_23;

import java.util.Arrays;

public class SortElementArrBubbleSort {
    // sort elements in array using bubble sort
    public static void main(String[] args) {

        /* Bubble sort principle - compare 1st num with the 2nd nu, if the 2nd num is smaller then 1st one then swap the number else don;t swap
            - number of loop will be (num of elements - 1)
         */

        int[] arr = new int[]{2,55,3,7,4,8,5,9,0,1};
        int length = arr.length;
        int temp;

        System.out.println("Before Sort: " + Arrays.toString(arr));

        // Bubble sort -
        for(int i = 0; i < length - 1; i++){            // If I = 0 then i < N, if i = 1, then i <= N

            for (int j = 0; j < length - 1; j++){

                if (arr[j] > arr[j+1]){                 // if 2nd num is greater then 1st num

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After Sort: " + Arrays.toString(arr));


    }
}
