package practice_session.Array.Single_Dimension;

import java.util.Arrays;
// this is how array could be separated
public class ArraySplitMethod {
    public static void main(String[] args) {

        String str = " Split this sentence into char Arr";

        char[] splitStringArr = str.toCharArray();
        System.out.println(Arrays.toString(splitStringArr));       // by this way we can put the string into array ref.

        for (int i = 0; i < splitStringArr.length; i++){    // this is how string can be put into char reference.
            System.out.println(splitStringArr[i]);
        }

    }
}
