package march_23;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveWhiteSpaces {
    // remove spaces form a given string
    public static void main(String[] args) {
        System.out.println("\nEnter String with spaces: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        sc.close();

        regex(str);
        charArray(str);
        stringBuilder(str);
        forLoop(str);



    }
    static void regex(String str){
        str = str.replaceAll("\\s+", "");
        System.out.println("\nUsing Regex: " + str);
    }

    static void charArray(String str){
        char[] ch  = str.toCharArray();
        String n = "";

        for (int i = 0; i < ch.length; i++){
            char temp = ch[i];
            if (temp != 32 && temp != 9){                           // ASCII 32 - spaces & 9 is TAB (4 spaces)
                n += ch[i];
            }

        }
        System.out.println("Using ASCII: " + n);
    }

    static void stringBuilder(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            if (!Character.isWhitespace(str.charAt(i))){
                sb = sb.append(str.charAt(i));
            }
        }
        System.out.println("String Builder : "+ sb);
    }

    static void forLoop(String str){
        String r = "";
        for (int i = 0; i<str.length(); i++){
            char temp = str.charAt(i);
            if (temp != 32 && temp != 9){                               // ASCII 32 - spaces & 9 is TAB (4 spaces)
                r+=temp;
            }
        }
        System.out.println("Using For Loop + String: " + r);
    }




}
