package qA_Fox;

public class CapitalLetterOfEachWord {
    // capitalize the first word of a given sentence

    public static void main(String[] args) {
        String str = "this is a sample statement";

        String[] sa = str.split(" ");

        String capital = "";

        for (int i = 0; i<sa.length;i++){
            String word = sa[i];

            char[]ca = word.toCharArray();

            String firstChar = String.valueOf(ca[0]);

            String capWord = firstChar.toUpperCase();

            for (int j = 0; j < ca.length; j++){
                capWord = capWord + ca[j];
            }
        }
        capital = capital + capital + " ";

        System.out.println(capital);
    }
}
