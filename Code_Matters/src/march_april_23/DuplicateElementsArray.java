package march_april_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElementsArray {
    // find Duplicate elements from array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - String\n2 - Numbers");
        int option  = sc.nextInt();
        System.out.println("Enter Length of Array: ");
        int size = sc.nextInt();
        DuplicateElementsArray dup = new DuplicateElementsArray();


        if (option==1){
            Scanner scanner = new Scanner(System.in);
            String [] str = new String[size];
            for (int i = 0; i < str.length; i++){
                System.out.println("Element " +(i +1));
                str[i] = scanner.nextLine();
            }
            dup.mapWithString(str);
        }
        else if (option==2){
            Integer[] arr = new Integer[size];
            for (int i = 0; i < arr.length; i++){
                System.out.println("Element " +(i +1));
                arr[i] = sc.nextInt();
            }
            dup.mapWithInt(arr);
        }else {
            System.out.println("Try Again. . . .");
        }


    }

    void mapWithString(String [] str){

        Map<String , Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length; i++){
            if (!map.containsKey(str[i])){
                map.put(str[i], 1);
            }
            else {
                map.put(str[i], map.get(str[i])+1);
            }
        }

        for (String a : map.keySet()){
            if (map.get(a) > 1){
                System.out.println(a +" = " + map.get(a));
            }
        }

    }

    void mapWithInt(Integer[] arr){

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++ ){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        for (Integer e : map.keySet()){
            if (map.get(e) > 1){
                System.out.println(e +" = " + map.get(e));
            }
        }
    }



}
