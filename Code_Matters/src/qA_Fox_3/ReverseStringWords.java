package qA_Fox_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringWords {
    // reverse the words in the string
    public static void main(String[] args) {

        String s = "Hello my name is Fahad Kader";
        String[] str = s.split(" ");

        String r = "";
        for (int i = 0; i< str.length;i++){
            r = str[i]+" "+r;
        }
        System.out.println(r);

        //========>

        System.out.println("\nUsing list");
        List<String> list = Arrays.asList(str);

        Collections.reverse(list);
        for (String t : list){
            System.out.print(t+" ");
        }


    }
}
