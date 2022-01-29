package tricky_automation;

import java.util.Arrays;
import java.util.BitSet;

public class Print1To100NoLoopNoRecursion {
    // print from 1 to 100, with using any loop or recursion

    public static void main(String[] args) {

        // 1. Array Fill:
        Object num[] = new Object[100];

        Arrays.fill(num,new Object(){
            int count = 0;
            @Override
            public String toString(){
                return Integer.toString(++count);
            }
        });

        System.out.println(Arrays.toString(num));

        System.out.println("=============================");


        // 2. Bitset :

        String set = new BitSet() {{set(1,101);}}.toString();
        System.out.append(set,1, set.length());

    }
}
