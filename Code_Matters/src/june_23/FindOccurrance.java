package june_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindOccurrance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine().trim();

        char[] ch = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i<ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        }

        for (Character c: map.keySet()){
            System.out.println(c +" = " + map.get(c));
        }

    }
}
