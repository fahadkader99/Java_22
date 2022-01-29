package rough_and_tough;

import java.util.Arrays;
import java.util.Scanner;

public class StringLeftRotation {
    /*
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2. ight2("Hello") → "loHel" right2("java") → "vaja" right2("Hi") → "Hi"
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str ");
        String str = sc.nextLine();

        char[]ch = str.toCharArray();

        char a = ch[0];
        char b = ch[1];

        if (str.length()>=3){
            for (int i =0; i< ch.length-2;i++){
                ch[i] = ch[i+2];
            }
            ch[ch.length-1] = a;
            ch[ch.length-2] = b;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : ch){
            sb.append(c);
        }

        System.out.println(sb);

    }
}
