package march_22;

import java.util.Scanner;

public class CapitalLetterOfWord {
    // capitalize the first word of each sentence

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();


        String[] s1 = s.split(" ");

        String capital = "";

        for (int i = 0; i< s1.length;i++){
            String word = s1[i];

            char[]ca = word.toCharArray();

            String firstChar = String.valueOf(ca[0]);
            String capWord = firstChar.toUpperCase();

            for (int j = 0; j< ca.length;j++){
                capWord = capWord+ca[j];
            }

        }
        capital = capital+capital+ " ";
        System.out.println(capital);
    }
}
