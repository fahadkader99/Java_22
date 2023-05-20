package march_april_23;

import java.util.ArrayList;
import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        // check if both the string is anagram or not.

        /*
        - means when the sting is in reversed order it will remain the same
         */

        /*
        2nd way in terms of given 2 string check if both the string is anagram or not means they should be the
         smae size & contain the same string

         */

        //way1();
        check2Str();

    }

    static void way1(){
        String a = "madam";
        String b = "";
        boolean flag = false;

        for (int i = a.length()-1; i>=0; i--){
            b+= a.charAt(i);
        }
        System.out.println(b);

        if (a.equals(b)){
            flag = true;
        }
        if (flag){
            System.out.println("String anagram");
        }else {
            System.out.println("Not anagram");
        }
    }

    static void check2Str(){
        String a = "abcde";
        String b = "abcd";

        if (a.length() == b.length()){
            char[] c = a.toCharArray();
            char[] d = b.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);

            if (Arrays.equals(c,d)){
                System.out.println("Anagram");
            }else {
                System.out.println("Not-anagram");
            }
        }else {
            System.out.println("Not-anagram");
        }
    }
}
