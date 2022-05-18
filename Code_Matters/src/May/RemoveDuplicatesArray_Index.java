package May;

import java.util.Arrays;

public class RemoveDuplicatesArray_Index {
    public static void main(String[] args) {
        // remove duplicate elements from sorted array using index

        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,9};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = 0;

        for (int i = 0; i< arr.length-1;i++){

            if (arr[i] != arr[i+1]){
                arr[index] = arr[i];
                index++;
            }

        }
        arr[index] = arr[arr.length-1];
        for (int k = 0; k<= index; k++){
            System.out.print(arr[k]+" ");
        }



    }
}
