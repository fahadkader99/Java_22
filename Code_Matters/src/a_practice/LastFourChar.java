package a_practice;

import java.util.Scanner;

public class LastFourChar {

    // extract last 4 char from  a string

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine().toLowerCase().trim();
        sc.close();

        if (a.length()>=4){
            String str = a.substring(a.length()-4);
            System.out.println("Last 4 - " + str);
        }else {
            System.out.println("String is smaller then 4");
        }

    }
}
