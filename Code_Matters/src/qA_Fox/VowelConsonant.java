package qA_Fox;

import java.util.Scanner;

public class VowelConsonant {

    // Find it using switch

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char: ");
        char ch = sc.next().charAt(0);
        sc.close();

        boolean isVowel = false;

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel = true;
            break;

            default:
                System.out.println("Consonant");
                break;



        }

        if (isVowel==true){
            System.out.println("Vowel");
        }

    }
}
