package qA_Fox;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    // reverse array using build in method
    public static void main(String[] args) {
        Integer []num = {9,8,7,6,5,4,3,2,1};

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));

        // Reverse array using list
        List<Integer> list = Arrays.asList(num);
        Collections.reverse(list);
        System.out.println("using list: "+ list);


    }
}
