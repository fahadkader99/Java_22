package qA_Fox;

import java.util.Arrays;
import java.util.Scanner;

public class Lat2LetterOfText {
    public static void main(String[] args) {
        // print last 3 letter of the given text / string

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        sc.close();

        char[]ch = str.toCharArray();
        int size = ch.length;

        String last3 = "";

        for (int i = size-1; i >= ch.length-3; i--){
            last3 = ch[i]+ last3;
        }
        System.out.println(last3);


        /////==========>
//        System.out.println();
//        if (str.length()>3){
//            System.out.println(str.charAt(str.length()-3)+str.charAt(str.length()-2)+str.charAt(str.length()-1));
//        }
//        else System.out.println("Cant fid the last 3 letter, String is small");

    }
}
