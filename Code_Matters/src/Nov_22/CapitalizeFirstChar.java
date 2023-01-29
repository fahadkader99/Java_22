package Nov_22;

import java.util.Scanner;

public class CapitalizeFirstChar {
    // Make the first letter of al the word capital

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line ");
        String a = sc.nextLine();
        sc.close();


        String [] str = a.split("\\s+");
        String capital = "";

        for (int i = 0; i<str.length; i++){
            String word = str[i];                   // word
            char[] ch = word.toCharArray();         // break the word into char array
            String firstChar = String.valueOf(ch[0]);   // convert 1st char to string
            String capitalizedWord = firstChar.toUpperCase();

            for (int j = 1; j < ch.length; j++){
                capitalizedWord+=ch[j];
            }

            capital+=capitalizedWord+" ";

        }

        System.out.println(capital);



    }
}
