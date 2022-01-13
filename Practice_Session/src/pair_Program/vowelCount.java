package pair_Program;

import java.util.Scanner;

public class vowelCount {
    /*
    Return the count of the vowel in a string
     */

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a word / letter");
        String word = input.nextLine().toLowerCase();

        System.out.println(findSum(word));

    }
    public static int findSum(String word){
        int number = 0;
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i)== 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                count++;
            }
        }

        return count;
    }
}
