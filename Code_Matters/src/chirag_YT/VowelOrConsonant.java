package chirag_YT;

import java.util.Scanner;

public class VowelOrConsonant {

    // check given character is vowel or not
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char c = input.next().toLowerCase().charAt(0);

        if (c=='a'||c=='e'||c=='o'||c=='i'||c=='u'){
            System.out.println("Vowel");
        }else System.out.println("Consonant");



    }
}
