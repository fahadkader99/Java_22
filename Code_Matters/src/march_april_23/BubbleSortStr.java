package march_april_23;

import java.util.Arrays;

public class BubbleSortStr {
    // bubble sort a string
    public static void main(String[] args) {
        String [] str = new String[]{"E", "B", "D", "A", "C"};

        String temp;

        for (int i = 0; i < str.length-1; i++){

            for (int j = 0; j < str.length-1; j++){

                if (str[j].compareTo(str[j+1]) > 0){
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }

        System.out.println("After sort: " + Arrays.toString(str));
    }
}
