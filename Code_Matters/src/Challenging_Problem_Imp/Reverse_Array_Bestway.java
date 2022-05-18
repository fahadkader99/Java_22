package Challenging_Problem_Imp;

import java.util.Arrays;

public class Reverse_Array_Bestway {
    // reverse an array and return the same array
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        //int[] s = reverse(arr);
        int[] s = reverse_with_pointer(arr);                // both works the same way but 2nd one is easier with 2 pointer .
        System.out.println(Arrays.toString(s));

    }
    public static int[] reverse(int[] arr){

        for (int i = 0; i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1 -i];
            arr[arr.length -1 -i] = temp;
        }
        return arr;

    }

    public static int[] reverse_with_pointer(int[] arr){

        int a_pointer = 0;
        int b_pointer = arr.length-1;

        while (a_pointer <= b_pointer){

            int temp = arr[a_pointer];
            arr[a_pointer] = arr[b_pointer];
            arr[b_pointer] = temp;

            a_pointer +=1;
            b_pointer -=1;

        }

        return arr;

    }
}
