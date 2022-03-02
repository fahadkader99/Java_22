package algo;

import java.util.Arrays;

public class BubbleSortAlgo {
    // if an array is in random order, neither in Ascending | Descending, in those case we can use Bubble sort Algo.
    // in bubble sort, 1st 2 elements are compared. If 1s is greater than the 2nd one then it will be swapped, it will keep going like this. like then next 2, again next 2 .......so largest num move to the right slowly
    // it is a phased approach, it will pick one number and keep comparing and slowly moving to the right

    public static void main(String[] args) {

        int[] arr = {35, 2, 5, 16, 3, 9, 12, 3, 1, 7};                   // Bubble sort can be used to sort in Ascending
        int temp;

        for (int i = 0; i < arr.length; i++) {        // iterate for the number of the length of the array.

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println("Bubble sort: "+Arrays.toString(arr));

    }
}
