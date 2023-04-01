package march_april_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListUpperCase {
    //Write a method that converts all strings in a list to their upper case.

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "mango", "lemon");
        List<String> fruits = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            String frt = list.get(i);
            fruits.add(frt.toUpperCase());
        }

        System.out.println(fruits);


    }
}
