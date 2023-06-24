package jan_feb_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    // print the first non repeating char in a String  - 17

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String  a = sc.nextLine().trim();
        sc.close();

        char[] ch = a.toCharArray();
        boolean flag = true;
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i< ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }
            else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        for (Character c : map.keySet()){
            if (map.get(c) <=1){
                System.out.println("First non-repeating char: " + c);
                flag = true;
                break;
            }else {
                flag = false;
            }
        }

        if (!flag){
            System.out.println("Not Found | Try again");
        }

    }
}
