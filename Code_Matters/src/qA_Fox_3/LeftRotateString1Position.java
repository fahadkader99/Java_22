package qA_Fox_3;

import java.util.Scanner;

public class LeftRotateString1Position {
    // left rotate a string by 1 position

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        char[]ch = str.toCharArray();       // fahad

        char first = ch[0];

        for (int i = 0; i<ch.length-1;i++){
            ch[i] = ch[i+1];
        }
        ch[ch.length-1] = first;

        StringBuilder sb = new StringBuilder();
        for (Character c: ch){
            sb.append(c);
        }
        System.out.println("After left rotation of string: "+ sb);

    }
}
