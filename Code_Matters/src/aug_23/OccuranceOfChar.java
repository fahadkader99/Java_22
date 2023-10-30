package aug_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfChar {
    // count the occurance of char in a given string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a String to count the chars");
        String a = scanner.nextLine().toLowerCase().trim();
        scanner.close();

 //       String  b = "My name is fahad";

        char1(a);


    }

    public  static  void char1(String  a){
//        String  a = "My name is fahad";
        int count = 1;

        char[] ch = a.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i<ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], count);
            }
            else {
                map.put(ch[i], map.get(ch[i]) + count);
            }
        }

        for (Character c : map.keySet()){
            System.out.println(c +" = " + map.get(c));
        }
    }
}
