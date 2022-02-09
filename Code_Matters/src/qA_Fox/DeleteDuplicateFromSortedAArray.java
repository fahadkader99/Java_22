package qA_Fox;

import java.util.Arrays;

public class DeleteDuplicateFromSortedAArray {
    // program to remove duplicate from sorted array, note: to remove duplicate array has to be sorted.

    public static void main(String[] args) {
        int[] num = {1,1,2,2,3,3,4,4,5,5,5,6,7,8,9,0,6,6,4,5,8};

        // 1st the array has to be sorted.
        Arrays.sort(num);
        int j = 0;

        for (int i = 0; i< num.length-1;i++){
            if (num[i]!= num[i+1]){
                num[j] = num[i];
                j++;
            }
        }
        num[j] = num[num.length-1];
        for (int k = 0; k<= j;k++){
            System.out.print(num[k]+" ");
        }

    }
}
