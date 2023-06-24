package march_april_23;

import java.util.Arrays;
import java.util.List;

public class MaxListElement {
    //Write a method that returns the largest integer in the list.
    //You can assume that the list has at least one element.
    public static void main(String[] args) {

        // return the largest integer
        List<Integer> list = Arrays.asList(7,6,5,4,3,9,8);
        int max = 0;

        for (int i = 0; i<list.size(); i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println("Max: " + max);
    }
}
