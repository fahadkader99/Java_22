package april_Fool;

import java.util.Arrays;

public class StrRightRotateBy1 {

    public static void main(String[] args) {
        // right rotate a string by 1 position

        String s = "12345";

        char []str = s.toCharArray();

        char last = str[str.length-1];

        for (int i = str.length-1; i>0; i--){
            str[i] = str[i-1];
        }

        str[0] = last;

        System.out.println(Arrays.toString(str));
        StringBuilder sb = new StringBuilder();

        for (Character c: str){
            sb.append(c);
        }
        System.out.println(sb);

    }
}
