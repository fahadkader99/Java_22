package pair_Program.Strings;

import java.util.Scanner;

public class ReverseString12 {
    //How do you reverse words in a given sentence without using any library method?

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a sentence to get reverse: ");
        String str = input.nextLine();

        ReverseString12 s12 = new ReverseString12();
        s12.reverseAll(str);
        //s12.reverseString(str);
        //s12.reverseStringBestMethod(str);

    }
    void reverseAll(String str){        // reverse full sentence!
        char[]ch = str.toCharArray();

        String reverse = "";
        char word = ' ';

        for (int i = 0; i <ch.length; i++ ){
            word = ch[i];
            reverse = word+reverse;
        }
        System.out.println("Reverse: "+ reverse);
    }
    void reverseString(String str){     // reverse string!
        String r = "";
        char c=' ';
        for (int i =0; i < str.length(); i++){
            c = str.charAt(i);
            r = c+r;
        }
        System.out.println(r);
    }
    void reverseStringBestMethod(String str){         // Reverse words in string best method....!

    char[] ch = str.toCharArray();
    String r = "";

    for (int i = ch.length-1; i >=0; i--){
        r += ch[i]+" ";
    }
        System.out.println("Reversed: "+ r);


    }
//    void reverseStringWordRemainSame(){
//
//    }
}
