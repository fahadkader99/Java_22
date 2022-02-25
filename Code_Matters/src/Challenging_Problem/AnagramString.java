package Challenging_Problem;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramString {
    /*Two strings are called anagrams if they contain same set of characters but in different order. For example,

peek and keep are anagrams

spar and rasp are anagrams

listen and silent are anagrams*/
    public static void main(String[] args) {        // limitation is with space and Uppercase and lower space

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String one:");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter String two:");
        String str2 = sc.nextLine().toLowerCase();
        sc.close();

        method1(str1,str2);
        method2(str1,str2);
        method3(str1,str2);     // first two method will fail if i use space.
        method4(str1,str2);     // Method 4 is working perfectly....!

    }
    public static void method1(String str1, String str2){       // using break down approach
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean flag = false;
        if (ch1.length == ch2.length) {
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] == ch2[i]) {
                    flag = true;
                }
            }
        }

        if (flag == true) {
            System.out.println("Anagram");

        } else System.out.println("Not anagram");
    }
    public static void method2(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean flag = Arrays.equals(ch1, ch2);         // using built in method


        if (flag == true) {
            System.out.println("Anagram");

        } else System.out.println("Not anagram");

    }
    public static void method3(String str1, String str2){                                       // using Array and sorting technique
        // this is more touchdown approach to check the sentence is Anagram or not

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ","");

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean flag = Arrays.equals(ch1, ch2);         // using built in method


        if (flag == true) {
            System.out.println("Anagram");

        } else System.out.println("Not anagram");

    }
    public static void method4(String str1, String str2){       // using map and comparing the maps ..... using collections
        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");

        Map<Character, Integer> map1 = new LinkedHashMap<>();
        for (int i = 0; i<str1.length();i++){
            char ch = str1.charAt(i);

            if (map1.get(ch)==null){
                map1.put(ch, 1);
            }else {
                map1.put(ch,map1.get(ch)+1);
            }
        }

        Map<Character, Integer> map2 = new LinkedHashMap<>();
        for (int i = 0; i<str2.length();i++){
            char ch = str2.charAt(i);

            if (map2.get(ch)==null){
                map2.put(ch,1);
            }else {
                map2.put(ch,map2.get(ch)+1);
            }
        }

        boolean isAnagram = map1.equals(map2);

        if (isAnagram){
            System.out.println("Anagram");
        }else System.out.println("Not Anagram");



    }
}
