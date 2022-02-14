package c_Bat.string2;

import java.util.Scanner;

public class RepeatSeparator {
    /*
    * Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
    * separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter a separator:");
        String separator = sc.nextLine();
        System.out.println("Enter a counter");
        int count = sc.nextInt();

//        String r = "";
//
//        for (int i = 0; i<=count-1;i++){
//            r = r+str+separator;
//        }
//        System.out.println(r);

        System.out.println(repeatSeparator(str,separator,count));
    }
    public static String repeatSeparator(String str, String separator, int count){
        if (count==0){
            return "";
        }
        StringBuffer result = new StringBuffer();

        for (int i = 0; i<count-1;i++){
            result.append(str);
            result.append(separator);

        }
        return result.append(str).toString();
    }
}
