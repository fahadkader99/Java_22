package march_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_____Operations_____ {
    public static void main(String[] args) {

        //reverseString();
        //add_Num_Sum_from_string();
        //find_occurance_ofChar();
        reverse_word_in_String();


    }

    public static void reverseString() {

        String a = "Fahad Kader";
        String r = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            r += a.charAt(i);
        }
        System.out.println(r);


    }

    public static void add_Num_Sum_from_string() {
        String s = "Fahad2 Kad4er2";

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int n = Integer.parseInt(String.valueOf(ch));
                sum += n;

            }
        }
        System.out.println(sum);


    }

    public static void find_occurance_ofChar(){

        String str = "Fahad2 Kad4er2";

        for (int i = 0; i<str.length()-1;i++){
          for (int j = i+1; j<str.length();j++){
              if (str.charAt(i) == str.charAt(j)){
                  System.out.println("Repeat "+str.charAt(j));
              }
          }
        }

    }

    public static void reverse_word_in_String(){
        String str = "MR Ashikul Kader Fahad";

        String [] words = str.split(" ");

        String rev = "";
        for (int i = 0; i< words.length;i++){
            rev = words[i] + " "+ rev;
        }
        System.out.println(rev);



         //========================> Using List:
        String[] ass = str.split(" ");
        List<String> list = Arrays.asList(ass);
        Collections.reverse(list);

        for (String p : list){
            System.out.print(p+" ");
        }


    }
}
