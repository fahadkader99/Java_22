package jan_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {
    // find the first non repeates char in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sting: ");
        String a = sc.nextLine().trim();
        sc.close();


        char[] ch = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        }

        for (Character c : map.keySet()){
            if (map.get(c) <= 1){
                System.out.println("1st repeated char: " + c);
                break;
            }
        }


    }
}
