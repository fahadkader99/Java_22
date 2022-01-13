package practice_session.Array.Single_Dimension;

import java.util.Arrays;

public class ArrayWitLong {
    public static void main(String[] args) {

        long[] l = {123,456,789,9101};

        for (int i = 0; i <l.length; i++){
            System.out.println(l[i]);
        }
        for (long x: l){
            System.out.println(x);
        }

        long[] l1 = new long[10];
        System.out.println(Arrays.toString(l1));

    }
}
