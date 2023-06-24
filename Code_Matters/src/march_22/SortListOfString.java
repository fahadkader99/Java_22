package march_22;

import java.util.Arrays;

public class SortListOfString {
    // write code to sort the list of Strings using java collection.

    public static void main(String[] args) {

        String[] inputList = { "Jan", "Feb", "Mar", "Apr", "may_22", "Jun", "Jul",
                "aug", "Sep", "Oct", "nov", "Dec" };

        System.out.println("==Before sort:");
        System.out.println(Arrays.toString(inputList));
        Arrays.sort(inputList);
        System.out.println("==After sort:");
        System.out.println(Arrays.toString(inputList));


        Arrays.sort(inputList,String.CASE_INSENSITIVE_ORDER);
        System.out.println("After case Intensive");
        for (String s : inputList){
            System.out.print(s+"  ");
        }

    }


}
