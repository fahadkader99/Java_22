package march_23;

import java.util.Arrays;
import java.util.List;

public class ListAverage {
    //Write a method that returns the average of a list of integers.

    public static void main(String[] args) {
        // return the avg value from a list of int
        // - the size & the sum of the elements

        List<Integer> list = Arrays.asList(3,4,5,6,7,8,9,1,2,0);

        int size = list.size();
        int sum = 0;


        for (Integer e : list){
            sum+= e;
        }
        System.out.println(sum);

        System.out.println("Avg of List: " + (sum/size));
    }
}
