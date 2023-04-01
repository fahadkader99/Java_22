package march_april_23;

import java.util.Arrays;
import java.util.Scanner;

public class RevEachWordStr {
    // reverse each word in a string
    public static void main(String[] args) {
        System.out.println("\nEnter a String: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim().toUpperCase();
        sc.close();

        usingLoop(a);
    }

    static void usingLoop(String a){
        String [] str = a.split("\\s+");
        String revLine = "";

        for (int i = 0; i< str.length; i++){
            String word = str[i];
            String revWord = "";

            for (int j = word.length()-1; j>= 0; j--){
                revWord+=word.charAt(j);
            }
            revLine = revLine + revWord +" ";
        }

        StringBuilder sb = new StringBuilder(revLine);
        System.out.println("Reversed words -> " + sb);
    }

}
