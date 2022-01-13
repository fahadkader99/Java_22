package codingBat.WarmUp2;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));

        for (String value : list) {
            if (value.equals("a")) {
                list.remove(value);
            }
        }

        System.out.println(list); //outputs [b, c]

    }
}
