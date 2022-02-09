package c_Bat.string2;

import java.util.Scanner;

public class bobThere {

    /*
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        boolean flag = false;


        for (int i = 0; i<str.length()-2;i++){
            if (str.charAt(i)=='b' && str.charAt(i+2)=='b'){
                flag = true;
            }
        }

        System.out.println(flag);
        sc.close();

    }
}
