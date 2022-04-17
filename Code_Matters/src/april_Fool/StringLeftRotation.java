package april_Fool;

import java.util.Arrays;

public class StringLeftRotation {

    // Left rotate a string by 1 position

    public static void main(String[] args) {

        String a = "Samsung";

        char[] ch = a.toCharArray();

        char left = ch[0];

        for (int i = 0; i< ch.length-1;i++){
            ch[i] = ch[i+1];
        }
        ch[ch.length-1] = left;

        System.out.println(Arrays.toString(ch));

        StringBuilder sb = new StringBuilder();
        for (Character c: ch){
            sb.append(c);
        }
        System.out.println(sb);

    }
}
