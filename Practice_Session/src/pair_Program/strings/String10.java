package pair_Program.Strings;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class String10 {
    //How do you print the first non-repeated character from a string?

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to find the 1st Non-repetitive char:");
        String str = input.nextLine().toLowerCase();

        boolean unique = false;

        for (int i =0; i < str.length();i++){
            unique = true;
            for (int j = 0; j < str.length(); j++){
                if (i !=j && str.charAt(i) == str.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if (unique){
                System.out.println("1st unique cha: "+ str.charAt(i));
                break;
            }
        }
    }
}
