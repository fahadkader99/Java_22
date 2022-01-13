package practice_session.Array.Single_Dimension;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int[] a = {2,4,6,8,10};

        for (int x : a){            // printing all elements using for each loop
            System.out.println(x);      // for each loop only works in forward mode
        }

        System.out.println(Arrays.toString(a));


        String name = "My name is Fahad kader";
        char[] c = name.toCharArray();
        System.out.println(Arrays.toString(c));     // converting regular string into array elements


    }

}
