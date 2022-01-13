package practice_session.Array.Single_Dimension;

import java.util.Arrays;

public class ArraySplitMethod2 {

    public static void main(String[] args) {

        String str = "Split this sentence into char Arr";

        String[] secondArr = str.split(" ");        // each word will be indexed into array.
        System.out.println(Arrays.toString(secondArr));

        for (int i = 0; i < secondArr.length; i++){
            System.out.println(secondArr[i]);
        }

       String s = "My name is Fahad Kader";
        char[] c = s.toCharArray();             // this is how converting string into array elements
        System.out.println(Arrays.toString(c));



    }
}
