package march_april_23;

import java.util.Arrays;

public class ArrayCopyIterating {   // 8
    // copy an array by iterating

    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(loop(num)));

    }

    static int[] loop(int[] num){

        int[] arr = new int[num.length];

        for (int i = 0; i < num.length; i++){
            arr[i] = num[i];
        }

        return arr;
    }


}
