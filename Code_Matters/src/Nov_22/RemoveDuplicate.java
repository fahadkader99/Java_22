package Nov_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    // remove duplicate from a sorted array

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,4,5,5,6,7,4,5, 9};
        Arrays.sort(arr);

        int j = 0;



        for (int i = 0; i< arr.length-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }

        arr[j] = arr[arr.length-1];

        for (int i = 0; i<=j; i++){
            System.out.print(arr[i]+" ");
        }



    }
}
