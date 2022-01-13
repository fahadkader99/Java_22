package pair_Program;

import java.util.Scanner;

public class Vowel_count_array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word / letter:  [vowel count]");
        String vowel = input.nextLine().toLowerCase();

        System.out.println("Number of Vowel: "+ findVowel(vowel));

    }
    public static int findVowel(String vowel){
        char[] ch = {'a','e','i','o','u'};
        int count = 0;

        for (int i = 0; i < ch.length; i++){
            for (int j = 0; j < vowel.length(); j++){
                if (ch[i] == vowel.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
