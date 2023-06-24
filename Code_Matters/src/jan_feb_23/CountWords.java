package jan_feb_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        // count the number of words in a line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line");
        String a = sc.nextLine().trim();
        sc.close();


        one(a);

    }
    static void one(String a){
        String [] arr = a.split("\\s+");
        System.out.println("\nTotal words: " + arr.length);
        Map<String , Integer> map = new LinkedHashMap<>();
        for (int i = 0; i< arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (String c : map.keySet()){
            System.out.println(c + " = " + map.get(c));
        }
    }
}
