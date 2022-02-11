package qA_Fox;

import java.util.*;

public class ListWithoutDuplicateValue {
    // return a list without duplicate value

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7));

        System.out.println("Before removing duplicate: "+list);

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < list.size();i++){
            if (set.add(list.get(i))==false){
                System.out.println(list.get(i));
            }
        }

        System.out.println("After removing duplicate: "+ set);

    }
}
