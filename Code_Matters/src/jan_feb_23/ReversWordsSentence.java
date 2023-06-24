package jan_feb_23;

import java.util.Scanner;

public class ReversWordsSentence {
    // reverse each words in a sentence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with words . .  ");
        String a = sc.nextLine().trim();
        sc.close();

        String [] arr = a.split("\\s+");

        reverseString(arr);
        reverseEachWord(arr);

    }

    static void reverseString(String [] arr){       // reverse the order of words in a sentence

        String sentence = "";

        for (int i = arr.length-1; i>= 0; i--){
            sentence+=arr[i] +" ";
        }

        System.out.println("\n"+sentence);

    }

    static void reverseEachWord(String [] arr){     // reverse each words without changing the position of words

        String sentence = "";

        for (int i = 0; i < arr.length; i++){       // words
            String rev = "";
            String word = arr[i];

            for (int j = word.length()-1; j>=0; j--){
                rev+= word.charAt(j);
            }

            sentence += rev+" ";

        }
        System.out.println(sentence);

    }
}
