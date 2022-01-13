package practice_session.Array.W3;

import java.util.Arrays;

public class insertElement {

    public static void main(String[] args) {

        // insert element in an array
        int[] a = {1,2,3,4,5,6,7,8,9,0};

        int index = 2;
        int insert = 10;

        System.out.println("Original array " + Arrays.toString(a));

        for (int i = a.length-1; i > index; i--){
            a[i] = a[i-1];
            a[index] = insert;
        }
        System.out.println();

        System.out.println("New Array "+ Arrays.toString(a));


    }

}
