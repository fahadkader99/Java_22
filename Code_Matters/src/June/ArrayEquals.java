package June;

import java.util.Arrays;

public class ArrayEquals {

    public static void main(String[] args) {
        // check 2 arrays are equals or not

        array1();
        //array2();

    }

    public static void array1() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        boolean equal = true;


        if (a.length == b.length) {

            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    equal = false;
                }
            }


        } else {
            equal = true;
        }


        if (equal) {
            System.out.println("Array equals");
        } else {
            System.out.println("Not equal");
        }
    }

    public static void array2() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

        boolean equal = Arrays.equals(a, b);

        System.out.println(equal);
    }


}
