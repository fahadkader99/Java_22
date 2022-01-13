package pair_Program.Strings;

import java.util.Scanner;

public class String7 {
    //How do you find duplicate characters in a given string?
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to find out duplicate element: ");
        String s = input.nextLine().toLowerCase();

        char[] ch = s.toCharArray();


        String7 s7 = new String7();
        s7.isSame(ch);

    }
    public char[] isSame(char[] ch){

        boolean duplicate = false;
        char dup = ' ';

        for (int i = 0; i <ch.length; i++){
            for (int j = i+1; j < ch.length;j++){
                if (ch[i]==ch[j]){
                    dup = ch[i];
                    duplicate=true;
                }
            }
        }
        if (duplicate){
            System.out.println("Duplicate char: "+ dup);
        }else {
            System.out.println("No Duplicate! ");
        }
        return ch;

    }
}
