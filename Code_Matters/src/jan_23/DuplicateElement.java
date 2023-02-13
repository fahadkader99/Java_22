package jan_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElement {
    // find duplicate element in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size");
        Integer size = sc.nextInt();

        Integer[] arr = new Integer[size];
        for(int i = 0; i< arr.length; i++){
            System.out.println("Enter element " +(i+1));
            arr[i] = sc.nextInt();
        }
        sc.close();

        dup1(arr);
    }

    static void dup1(Integer[] arr){
        boolean flag = false;

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++ ){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (Integer e: map.keySet()){
            if (map.get(e) > 1){
                map.put(e, map.get(e));
            }
        }

        System.out.println(map);

    }
}
