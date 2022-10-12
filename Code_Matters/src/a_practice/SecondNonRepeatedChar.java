package a_practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondNonRepeatedChar {

    public static void main(String[] args) {
        // find out the second non repeated char

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine().toLowerCase();
        sc.close();

        char[] ch = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 1;

//        for (int i=0; i< a.length(); i++){
//
//            if (!map.containsKey(a.charAt(i))){
//                map.put(a.charAt(i), count);
//            }
//            else {
//                map.put(a.charAt(i), map.get(a.charAt(i))+1);
//            }
//        }

        for (int i=0; i<ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], count);
            }
            else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() ==1){
                System.out.println("Second Non-repeated char " + entry.getKey());
                break;
            }
        }
    }
}
