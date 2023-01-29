package jan_23;

import java.util.*;

public class DuplicateCharString {
    // find the duplicate char in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String  a = sc.nextLine().trim();
        sc.close();

        DuplicateCharString dup = new DuplicateCharString();
        //dup.withSet(a);
        dup.withMap(a);

    }

    void withSet(String a ){
        Set<Character > set = new LinkedHashSet<>();
        char[] ch = a.toCharArray();
        for (int i = 0; i<ch.length; i++){
            if (set.add(ch[i])==false){
                System.out.println("Duplicate: " + ch[i]);
            }
        }
    }


    void withMap(String a){
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = a.toCharArray();

        for (int i = 0; i<ch.length; i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        for (Character c : map.keySet()){
            if (map.get(c) > 1){
                System.out.println(c +" = " + map.get(c));
            }
        }


    }
}
