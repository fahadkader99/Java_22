package may_22;

import java.util.Arrays;

public class StringReverse {
    // reverse string

    public static void main(String[] args) {


        //rev1();
        rev2();


    }
    public static void rev1(){
        String a = "1234";
        String b = "";

        for (int i = 0; i<a.length();i++){
            b+= a.charAt(i);
        }
        System.out.println(b);
    }

    public static void rev2(){
        String s = "123456789";
        char ch[] = s.toCharArray();

        int a = 0;
        int b = ch.length-1;


        while (a<=b){
            char temp = ch[a];
            ch[a] = ch[b];
            ch[b] = temp;

            a+= 1;
            b-= 1;
        }

        System.out.println(Arrays.toString(ch));
        StringBuilder sb = new StringBuilder();
        for (Character c : ch){
            sb.append(c);
        }
        System.out.println(sb);


    }
}
