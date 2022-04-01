package Challenging_Problem_1;

import java.util.Scanner;

public class CapitalizeFirstLetterOfWords {

    // capitalize the first letter of each word in a sentence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line");
        String actualStr = sc.nextLine();



        String n =actualStr.replaceAll("\\s{2,}"," ").trim();      // trim take care of the first and last space and regex is taking care any space from 2 or more
        System.out.println(n);
        String[]arr = n.split(" ");


        for (String s: arr){

            System.out.print(s.substring(0,1).toUpperCase()+s.substring(1,s.length())+" ");
        }

        sc.close();

    }
}
