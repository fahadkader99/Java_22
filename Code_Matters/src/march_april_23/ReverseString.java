package march_april_23;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // reverse a string in 4 way
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine().trim();
        sc.close();

        rev1(str);
        rev2(str);
        rev3(str);
        rev4(str);

    }

    static void rev1(String str){
        System.out.println();
        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
        System.out.println();
    }

    static void rev2(String str){
        String rev = "";
        for (int i = str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
    static void rev3(String str){
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
    static void rev4(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
