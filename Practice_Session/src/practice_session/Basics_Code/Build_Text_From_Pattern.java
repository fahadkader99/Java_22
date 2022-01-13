package practice_session.Basics_Code;

import java.util.Scanner;

public class Build_Text_From_Pattern {
    /**
     * Write a program that builds a text from a pattern with the following definition
     * 1) Word
     * 2) Separator
     * 3) Times
     *
     * if values are as follows -> word = java, separator = &, times = 2
     * then it should print "java&java"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        System.out.println("Enter a separator: ");
        String separator = input.nextLine();                                         //String.valueOf(input.nextLine().charAt(0));
        System.out.println("Enter no. of times to printout: ");
        int times = input.nextInt();
        System.out.println();

        Build_Text_From_Pattern q = new Build_Text_From_Pattern();
        System.out.println(q.buildTest(word,separator,times));

    }
    public String buildTest(String word, String separator,int times){
        String result ="";
        for (int i = 1; i <= times; i++){
            result = result+ word + separator;
        }
        return result.substring(0,result.length()-1);
    }
}
