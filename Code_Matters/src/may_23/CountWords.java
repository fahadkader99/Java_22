package may_23;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWords {
    // write a program to count words from a line

    public static void main(String[] args) {

        String line = "MY NAME IS FAHAD AND MY PASSION IS JAVA I LOVE JAVA";

        String [] arr = line.split(" ");
        Map<String , Integer> map = new LinkedHashMap<>();

        for (int i = 0; i<arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        for (String s : map.keySet()){
            System.out.println(s +" = " + map.get(s));
        }

        System.out.println("======================Duplicate words ==============");

        for (String s : map.keySet()){
            if (map.get(s) > 1){
                System.out.println(s +" = " + map.get(s));
            }
        }



    }
}
