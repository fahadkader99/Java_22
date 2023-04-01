package march_april_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {
    // from a given string find the first non-repeated char]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine().trim();
        sc.close();

        char[] ch = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i< ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        boolean flag = false;
        for (Character c: map.keySet()){
            if (map.get(c) == 1){
                System.out.println(c +" = " + map.get(c));
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Not found. ");
        }
    }
}
