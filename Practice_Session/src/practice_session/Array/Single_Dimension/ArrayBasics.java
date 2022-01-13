package practice_session.Array.Single_Dimension;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int sum = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);

        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i]+ " ");
        }

        for (int i = 0; i < a.length; i ++){
            sum = sum + a[i];

        }

        int avg = sum / a.length;
        System.out.println("Sum is: " + sum);
        System.out.println("Avg is: " + avg);

    }
}
