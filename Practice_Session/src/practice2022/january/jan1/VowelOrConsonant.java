package practice2022.january.jan1;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a char");
        char ch = s.next().toLowerCase().charAt(0);


        if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            System.out.println("Char is vowel");
        }else System.out.println("Char is Consonant");

    }

}
