package jan_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChars {
    // find out the first non repeating char from a word

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word:  ");
        String a = sc.nextLine().trim();
        sc.close();

        one(a);

    }

    static void one(String a ){
        char[] ch = a.toCharArray();
        boolean flag = false;
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i< ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }
            else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        }

        for (Character c : map.keySet()){
            if (map.get(c) <= 1){
                flag = true;
                System.out.println("1st non-repeating char: " + c);
                break;
            }else {
                flag = false;
            }
        }

        if (!flag){
            System.out.println("Not found | Try again . . .");
        }

    }
}
