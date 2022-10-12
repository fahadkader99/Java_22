package qA_Fox_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCHar {

    // find duplicate char in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String a = sc.nextLine();

        char[] ch = a.toCharArray();

        int count= 1;
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i<ch.length; i++){

            if (!map.containsKey(ch[i])){
                map.put(ch[i], count);
            }
            else {
                map.put(ch[i], map.get(ch[i])+1);
            }

        }

        for (char c : map.keySet()){
            System.out.println( c +" " + map.get(c));
        }




    }

}
