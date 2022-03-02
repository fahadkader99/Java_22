package qA_Fox_3;

import java.util.Scanner;

public class LeftRotateStringBy1 {
    // left rotate a string by1 position

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  ");
        String str = sc.nextLine();                 // fahad

        LeftRotateStringBy1 one = new LeftRotateStringBy1();
        one.strLeftRotation(str);
    }
    public void strLeftRotation(String str){
        char[]ch = str.toCharArray();

        int size = ch.length;
        char first = ch[0];
        for (int i = 0;i<size-1;i++){
            ch[i] = ch[i+1];
        }
        ch[ch.length-1] = first;

        StringBuilder sb = new StringBuilder();
        for (Character c : ch){
            sb.append(c);
        }
        System.out.println("After rotating string: "+ sb);



    }
}
