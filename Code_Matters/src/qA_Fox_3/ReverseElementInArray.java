package qA_Fox_3;

import java.util.Arrays;

public class ReverseElementInArray {
    // reverse the element in the array using regular way
    public static void main(String[] args) {

        int []  arr = {6,5,4,3,2,1};

        int first = 0;
        int last = arr.length-1;
        int temp= 0;

        while (first<last){
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println("After reverse: "+ Arrays.toString(arr));

    }
}
