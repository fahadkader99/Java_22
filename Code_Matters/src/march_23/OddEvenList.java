package march_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEvenList {
    // program to find the odd & even in a list
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        int even = 0;
        int odd = 0;

        for (int i = 0; i<list.size(); i++){
            if (list.get(i) % 2 == 0){
                System.out.println("Even: " + list.get(i));
                even++;
            }
        }

        for (int i = 0; i<list.size(); i++){
            if (list.get(i) % 2 != 0){
                System.out.println("Odd: " + list.get(i));
                odd++;
            }
        }

        System.out.println("\nTotal even: " + even + "\nTotal Odd: " + odd);

    }
}
