package march_23;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with words");
        String s = sc.nextLine().trim();
        sc.close();

        String [] str = s.split("\\s+");


        String revLine = "";

        for (int i = 0; i < str.length; i++){
            String word = str[i];
            String revWords = "";

            for (int j = word.length()-1; j>=0; j--){
                revWords+=word.charAt(j);
            }
            revLine += revWords +" ";
        }

        System.out.println(revLine);

    }
}
