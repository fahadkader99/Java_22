package June;

import java.util.*;

public class RemoveDuplicates {

    // remove duplicates from a list

    public static void main(String[] args) {

        remove1();
        remove2();

    }
    public static void remove1(){
        List<Integer> list = new ArrayList<>();
        Integer[] arr = {1,2,3,4,5,6,1,2,3,4,7,8,9,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i<arr.length-1; i++){
            if (arr[i] != arr[i+1]){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    public static void remove2(){
        Integer[] arr = {1,2,3,4,5,6,1,2,3,4,7,8,9,0};
        Set<Integer> set = new LinkedHashSet<>();

        for (int i= 0; i<arr.length; i++){
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}
