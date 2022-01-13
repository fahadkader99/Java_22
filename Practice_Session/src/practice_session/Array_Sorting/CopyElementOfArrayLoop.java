package practice_session.Array_Sorting;

import java.util.Arrays;

public class CopyElementOfArrayLoop {
    public static void main(String[] args) {

        int[] num = {4,6,8,10,12};

        System.out.println("Num : " + Arrays.toString(num));

        int[] num2 = new int[num.length];      // elements of num can't be copied like this in array, have to use loops to copy elements

        System.out.println("Num2 :" + Arrays.toString(num2));

        for (int i = 0; i < num.length; i++){   // this is how elements should be copied.
            num2[i] = num[i];
        }
        System.out.println("After copying num to num2 : "+ Arrays.toString(num2));






    }
}
