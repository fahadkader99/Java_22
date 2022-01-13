package practice2022.january.jan2;

import java.util.Scanner;

public class DuplicateCharInString2 {
    //How do you find duplicate characters in a given string?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        char[] ch = str.toCharArray();

        boolean isDouble = false;
        char c = ' ';

        for (int i = 0; i < ch.length; i++){
            for (int j = i+1; j < ch.length; j++){
                if (ch[i]==ch[j]){
                    c = ch[i];
                    isDouble = true;
                }
            }
        }
        if (isDouble){
            System.out.println("Duplicate "+ c);
        }else System.out.println("No duplicate. ");



    }
}
