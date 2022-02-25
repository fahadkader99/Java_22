package qA_Fox;

import java.util.Scanner;

public class LeftRotateString3Position {
    // left rotate a string by 3 position
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        int position = 3;

        char[]ch = str.toCharArray();

        int size = ch.length;


        for (int j = 0; j<position;j++){
            char first = ch[0];
;

            for (int i = 0; i<ch.length-1;i++){
                ch[i] = ch[i+1];
            }
            ch[ch.length-1] = first;

        }

        StringBuilder sb = new StringBuilder();
        for (Character c : ch){
            sb.append(c);
        }
        System.out.println("After rotating 3 position: "+ sb);

    }
}
