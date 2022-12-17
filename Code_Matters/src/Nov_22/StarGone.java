package Nov_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StarGone {
    /*

Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String a = sc.nextLine().trim();
        String b = a;
        sc.close();
        String c = "";
        boolean flag = false;

//        if (b.length() > 3){
//
//            for (int i=0; i<b.length(); i++){
//
//                if (b.charAt(i)=='*'){
//                   c+= b.substring(0, i-1) + b.substring(i+2);
//                   flag = true;
//                }
//                else {
//                    flag = false;
//                }
//
//            }
//        }else {
//            flag = false;
//        }
//
//        if (!flag){
//            System.out.println("Try Again");
//
//        }else {
//            System.out.println(c);
//        }
        c = b.replaceAll("[a-zA-Z1-9]?\\*+[a-zA-Z1-9]?", "");

        System.out.println(c);

    }
}
