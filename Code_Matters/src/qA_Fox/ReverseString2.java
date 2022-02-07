package qA_Fox;

import java.util.Arrays;

public class ReverseString2 {
    public static void main(String[] args) {

        String str = "Ashikul";

        reverse1(str);
        reverse2(str);


    }
    public static void reverse1(String str){

        String r = "";

        for (int i = 0; i<str.length();i++){
            r = str.charAt(i)+r;
        }

        System.out.println("Reversed of "+ str+ " is: "+ r);

    }
    public static void reverse2(String str){
        String  c = "";

        char [] ch = str.toCharArray();

        for (int i = 0; i<ch.length;i++){
            c = ch[i]+c;
        }
        System.out.println("Reversed of "+ str+ " is: "+ c);

    }
}
