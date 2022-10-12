package a_practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {
    // find the first non-repeated character in a string

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine().toLowerCase();

        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 1;

        for (int i=0; i<a.length();i++){

            if (!map.containsKey(a.charAt(i))){
                map.put(a.charAt(i), count);

            }
            else {
                map.put(a.charAt(i), map.get(a.charAt(i))+1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                System.out.println("1st non-repeated char -> " + entry.getKey());
                break;
            }
        }


    }
}
