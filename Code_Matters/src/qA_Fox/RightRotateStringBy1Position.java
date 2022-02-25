package qA_Fox;

import java.util.Scanner;

public class RightRotateStringBy1Position {
    // right rotate string by 1 position
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();                 // fahad > dfaha

        char[]ch = str.toCharArray();

        char last = ch[ch.length-1];

        for (int i = ch.length-1;i>0;i--){
            ch[i] = ch[i-1];
        }
        ch[0] = last;

        StringBuilder sb = new StringBuilder();
        for (Character c : ch){
            sb.append(c);
        }
        System.out.println("After right rotating 1 position: "+ sb);


    }
}
