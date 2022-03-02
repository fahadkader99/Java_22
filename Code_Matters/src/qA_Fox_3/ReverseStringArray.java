package qA_Fox_3;

import java.util.Scanner;

public class ReverseStringArray {
    // reverse a stringUsingArray

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        sc.close();


        char[]ch = str.toCharArray();
        String r = "";

        for (int i = ch.length-1; i >=0; i--){
            r += ch[i];
        }
        System.out.println(r);

    }
}
