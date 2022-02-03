package talent_LMS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class xtoX {
    /*
    By using replace method please change x to capital X.
//input "oxoxoxox";
// output is  "oXoXoXoX"
     */

    public static void main(String[] args) {
        String word = "oxoxoxox";

        String r = word.replace('x','X');
        System.out.println(r);
    }
}