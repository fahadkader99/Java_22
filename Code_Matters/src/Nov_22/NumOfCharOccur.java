package Nov_22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumOfCharOccur {

    // find the number of times a char is repeated in a given string
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String  a = sc.nextLine().toLowerCase().trim();

        char[] ch = a.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(int i =0; i<ch.length ; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }
            else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        for (Character c : map.keySet()){
            if (map.get(c)>1){
                System.out.println(c+" = " + map.get(c));
            }
        }

        sc.close();

    }
}
