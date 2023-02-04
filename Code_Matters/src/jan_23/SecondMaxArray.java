package jan_23;

import java.util.Arrays;

public class SecondMaxArray {
    // find the second max number in an array
    public static void main(String[] args) {
        int[] arr = new int[] {1,7,4,6,2,3,8};

        secondMax(arr);
    }
    static void secondMax(int[] arr){
        Arrays.sort(arr);                       // Array must be sorted
        int max = arr[0];

        for (int i = 0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max: "+max);

        for (int i = arr.length-2; i>=0; i--){
            if (arr[i] != arr[arr.length-1]){
                System.out.println("Second max: " + arr[i]);
                break;
            }
        }

    }
}
