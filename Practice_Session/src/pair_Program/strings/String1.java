package pair_Program.Strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

     //How do you reverse a given string in place?

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = input.nextLine();

//        StringBuilder str = new StringBuilder(input.nextLine());      > with string builder
//        str.reverse();
//        System.out.println(str);

        String str = "";
        char c;
        for (int i = 0; i < s.length(); i++){           // using manual for loop
            c = s.charAt(i);
            str = c+str;
        }
        System.out.println("Reversed: "+str);


    }
}
