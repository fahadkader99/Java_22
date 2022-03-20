package march_22;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        str1(str);
        str2(str);
        builder(str);

    }
    public static void str1(String str){
        String r = "";

        for (int i = str.length()-1; i>=0;i--){
            r += str.charAt(i);
        }
        System.out.println(r);
    }

    public static void str2(String str){
        char[] ch = str.toCharArray();
        String r ="";
        for (int i = ch.length-1; i>=0;i--){
            r += ch[i];
        }
        System.out.println(r);
    }
    public static void builder(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}
