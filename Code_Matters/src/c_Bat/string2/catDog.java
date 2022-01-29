package c_Bat.string2;

import java.util.Scanner;

public class catDog {
    /*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        int cat = 0;
        int dog = 0;

        for (int i = 0; i <str.length()-2;i++){
            if (str.substring(i,i+3).equals("cat")){
                cat++;
            }
            if (str.substring(i,i+3).equals("dog")){
                dog++;
            }
        }

        System.out.println("cat "+ cat);
        System.out.println("dog "+ dog);
        if (cat==dog){
            System.out.println("True");
        }else System.out.println("False");

    }
}
