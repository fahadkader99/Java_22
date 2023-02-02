package jan_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        // reverse an array List

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //one(list);
        two(list);


    }

    static void one(List<Integer> list){
        Collections.reverse(list);
        System.out.println(list);
    }

    static void two(List<Integer> list){

//        for (int i = 0; i < list.size()/2; i++){
//            int temp = list.get(list.size()-i-1);
//            list.get(list.size()-i-1) = list.get(i);
//           list.get(i) = temp;
//        }

        System.out.println(list);
    }
}
