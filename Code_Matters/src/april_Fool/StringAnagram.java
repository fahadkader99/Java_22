package april_Fool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {

        //m1();
        m2();

    }
    public static void m1(){
        String a = "army";
        String b = "mara";

        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        boolean isSame = str1.equals(str2);

        if (isSame){
            System.out.println("String Anagram");
        }else {
            System.out.println("Not anagram");
        }
    }

    public static void m2(){
        String a = "army";
        String b = "mary    ";

        a = a.replace(" ","");
        b = b.replace(" ","");

        Map<Character, Integer> map1 = new LinkedHashMap<>();
        for (int i = 0; i<a.length();i++){
            char ch = a.charAt(i);

            if (map1.get(ch)==null){
                map1.put(ch, 1);
            }else {
                map1.put(ch, map1.get(ch)+1);
            }

        }

        Map<Character,Integer> map2 = new LinkedHashMap<>();
        for (int i = 0; i<b.length();i++){

            char ch = b.charAt(i);
            if (map2.get(ch)==null){
                map2.put(ch, 1);
            }else {
                map2.put(ch, map2.get(ch)+1);
            }
        }

        boolean isSame = map1.equals(map2);

        if (isSame){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
