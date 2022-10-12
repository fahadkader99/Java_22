package June;

import java.util.Arrays;

public class SumOfArray {
    // find the sum of elements in array

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        int sum = 0;

        for (int i = 0; i< array.length; i++){
            sum+= array[i];
        }
        System.out.println("Sum of array " + sum);
    }
}
