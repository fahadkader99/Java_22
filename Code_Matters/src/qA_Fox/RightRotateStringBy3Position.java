package qA_Fox;

import java.util.Scanner;

public class RightRotateStringBy3Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("How many position to Right Rotate: ");
        int position = sc.nextInt();


        char[] ch = str.toCharArray();


        for (int j = 0; j < position; j++) {                // if i take j = 1; then j <= position
            char last = ch[ch.length - 1];

            for (int i = ch.length - 1; i > 0; i--) {
                ch[i] = ch[i - 1];
            }
            ch[0] = last;
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : ch){
            sb.append(c);
        }
        System.out.println("Right rotation: "+sb);


    }
}
