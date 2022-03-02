package rough_and_tough_2;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayBuiltInMethod {
    public static void main(String[] args) {

        method1();
        method2();
        reversingSort();



    }
    public static void method1(){
        int[]arr = {10,40,20,12,60,40};

        System.out.println(Arrays.toString(arr));

        Arrays.parallelSort(arr);


        System.out.println(Arrays.toString(arr));

    }
    public static void method2(){
        int[]arr = {10,40,20,12,60,40};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
    public static void reversingSort(){
        Integer[]arr = {10,40,20,12,60,40};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));


    }

}
