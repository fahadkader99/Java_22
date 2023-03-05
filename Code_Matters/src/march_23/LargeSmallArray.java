package march_23;

import java.util.Arrays;

public class LargeSmallArray {
    // find the largest , second larges & smallest element in array

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        //int[] arr = new int[] {8,7,6,5,4,3,1, 10, 15};
        //int[] arr = new int[] {22,55};
        //int[] arr = new int[] {100};

        LargeSmallArray code = new LargeSmallArray();
        code.largest(arr);
        code.lowest(arr);

    }

    void largest(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];

        boolean flag = false;
        if (arr.length > 1){
            flag = true;
        }else {
            System.out.println("Only Element: " + Arrays.toString(arr));
            flag = false;
        }

        if (flag) {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    secondMax = arr[i - 1];
                }
            }
            System.out.println("Max: " + max + "\nSecond max: " + secondMax);
        }

    }

    void lowest(int[] arr){
        int lowest = arr[0];            //Integer.MAX_VALUE;
        int secondLowest = arr[1];      // Integer.MAX_VALUE;
        boolean flag = false;

        if (arr.length > 1){
            flag = true;
        }else {
            System.out.println("Only Element: " + Arrays.toString(arr));
            flag = false;
        }

        if (flag){
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++){
                if (arr[i] < lowest){
                    lowest = arr[i];
                    secondLowest = arr[i + 1];

                }
            }
            System.out.println("\nLowest: " + lowest +"\nSecond Lowest: " + secondLowest);
        }

    }
}
