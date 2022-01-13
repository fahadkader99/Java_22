package practice2022.january.jan2;

import java.util.Scanner;

public class NumOfVowelConsonant {
    //How do you count a number of vowels and consonants in a given string?
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a string: ");
        String str = input.nextLine();
        int countV = 0;
        int countC = 0;


        for (int i = 0; i< str.length(); i++){
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'){
                countV++;
            }else {
                countC++;
            }
        }
        System.out.println("No. of vowel: "+ countV);
        System.out.println("No. of consonant: "+ countC);


    }
}
