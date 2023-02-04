package jan_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinList {
    // find the max & min value in a list
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1 ;i<= 5; i++){
            list.add(i);
        }
        System.out.println(list);
        Collections.sort(list);

        System.out.println("Max " + list.get(list.size()-1));
        System.out.println("Min " + list.get(0));
    }
}
