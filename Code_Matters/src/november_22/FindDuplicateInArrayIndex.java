package november_22;

import java.util.Arrays;

public class FindDuplicateInArrayIndex {
    // find the duplicate elements in array using index
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,1,2,3,4,5,10, 20};
        Arrays.sort(arr);
        for (int i=0; i<arr.length;i++){
            for (int j = i+1; j<arr.length ;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i] + " is duplicate");
                }
            }
        }
    }
}
