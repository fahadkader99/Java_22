package jan_feb_23;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {
    // reverse each words in a sentence;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line: ");
        String a = sc.nextLine().trim().toLowerCase();
        sc.close();

        String[] str = a.split("\\s+");
        System.out.println(Arrays.toString(str));

        String revLine = "";


        for (int i = 0; i<str.length; i++){
            String word = str[i];
            String revWord = "";

            for (int j = word.length()-1; j>= 0; j--){
                revWord += word.charAt(j);
            }

            revLine +=  revWord +" ";
        }

        System.out.println(revLine);
    }
}
