package march_22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementArray {
    // write a code to filter duplicate elements from an array and print as list.
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,0,10,3,4,5,6,7,8,9,2,1};

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        returnDuplicate(num,list);
        removeDuplicate(num,set);

    }
    public static void returnDuplicate(int[] num, List<Integer> list){

        for (int i = 0; i< num.length;i++){
            for (int j = i+1; j< num.length;j++){
                if (num[i]==num[j]){
                    list.add(num[j]);
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
