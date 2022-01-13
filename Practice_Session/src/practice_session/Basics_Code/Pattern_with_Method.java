package practice_session.Basics_Code;

import java.util.Scanner;

public class Pattern_with_Method {
    public static void main(String[] args) {
        /**
         * Write a program that builds a text from a pattern with the following definition
         * 1) Word
         * 2) Separator
         * 3) Times
         *
         * if values are as follows -> word = java, separator = &, times = 2
         * then it should print "java&java"
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any word: ");
        String word = input.nextLine();
        System.out.println("What would be a separator?");
        String separator = input.nextLine();
        System.out.println("How many time would you like to print out? ");
        int times = input.nextInt();


        Pattern_with_Method p = new Pattern_with_Method();
        System.out.println(p.buildTest(word, separator, times));



    }
    public String buildTest(String word, String separator, int times ){
        String result = "";
        for(int i = 1; i <= times; i++){
            result = result+word+separator;
        }
        return result.substring(0,result.length()-1);
    }


}
