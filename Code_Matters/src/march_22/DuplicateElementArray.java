package march_22;

import java.util.*;

public class DuplicateElementArray {
    // write a code to filter duplicate elements from an array and print as list.
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,1,2,3,4,6};

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        returnDuplicate();
        //removeDuplicate(num,set);

    }
    public static void returnDuplicate(){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);

        for (int i = 0; i<list.size()-1;i++){
            for (int j = i+1; j<list.size();j++){
                if (list.get(i).equals(list.get(j))){
                    list.remove(list.get(j));
                }
            }
        }
        System.out.println(list);
    }
    public static void removeDuplicate(int[] num, Set<Integer> set){

        for (int i = 0; i< num.length;i++){
            if (set.add(num[i])==false){
                set.add(num[i]);
            }
        }
        System.out.println(set);

    }
}
