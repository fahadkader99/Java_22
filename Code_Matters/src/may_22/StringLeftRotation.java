package may_22;

import java.util.Arrays;

public class StringLeftRotation {

    public static void main(String[] args) {
        String a = "12345";

        char [] ch = a.toCharArray();
        char left = ch[0];

        for (int i = 0; i< ch.length-1; i++){
            ch[i] = ch[i+1];
        }
        ch[ch.length-1] = left;

        StringBuilder sb = new StringBuilder();
        for (char c : ch){
            sb.append(c);
        }
        System.out.println(sb);

        System.out.println(Arrays.toString(ch));
    }
}
