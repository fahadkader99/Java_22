package may_22;

import java.util.Arrays;

public class SortArray {
    // sorting array

    public static void main(String[] args) {
        int[] arr = {6,5,3,4,1,2};

        sortArray1(arr);
        sortArray2(arr);

    }
    public static void sortArray1(int[] arr){
        for (int i = 0; i< arr.length;i++){

            for (int j = i+1; j< arr.length;j++){

                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray2(int[] arr){

        // using build in sort

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
