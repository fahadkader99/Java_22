package jan_feb_23;

import java.util.*;

public class DuplicateChar {
    // find the duplicate char in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine().trim();
        sc.close();

        char[] ch = a.toCharArray();

        //one(ch);
        two(ch);

    }

    static void one(char[] ch){

        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i< ch.length; i++){
            if (set.add(ch[i])==false){
                System.out.println("Dup: "+ch[i]);
            }
        }

    }

    static void two(char[] ch){
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
            if (map.get(c) > 1){
                System.out.println(c +" = " + map.get(c));
            }
        }
    }
}
