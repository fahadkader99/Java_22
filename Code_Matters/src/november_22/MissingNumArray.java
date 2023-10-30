package november_22;

import java.util.Arrays;

public class MissingNumArray {
    // find the missing Num

    public static void main(String[] args) {
        /*
        the array has to be sorted to be in order
        the array can't contain the same element twice

        1st find the sum of actual array
        2nd find the sum of range 1st to last
        then substract the difference
         */
       Integer[] arr = new Integer[] {1,2,3,4,6};
       int sumArr = 0;
       int sumRange = 0;

       for(int i=0; i<arr.length; i++){
           sumArr+=arr[i];
        }
        System.out.println(sumArr);

       Arrays.sort(arr);


       for (int i=arr[0]; i<=arr[arr.length-1]; i++){
           sumRange+=i;
       }
        System.out.println(sumRange);

        System.out.println("Missing Num > " + (sumRange-sumArr));
    }
}
