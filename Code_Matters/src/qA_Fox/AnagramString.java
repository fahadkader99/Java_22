package qA_Fox;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    // check if the both string are anagram

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String a = sc.nextLine().toLowerCase();
        System.out.println("Enter 2nd String");
        String b = sc.nextLine().toLowerCase();

        String c = a.replace(" ", "");
        String d = b.replace(" ","");

        char[] x = c.toCharArray();
        char[] y = d.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

//        if (x.length==y.length){
//            if (Arrays.equals(x,y)){
//                System.out.println("Both are anagrams. ");        // this will also work
//            }
//        }

        boolean ana = Arrays.equals(x,y);
        if (ana == true){
            System.out.println("Both anagrams");
        }else System.out.println("Not anagrams");
    }
}
