package april_Fool;

import java.util.Scanner;

public class April_1 {
    public static void main(String[] args) {

        //insertWord();
        //last3WordOfText();
        //printHalfText();
        findNUmOfElement();


    }
    public static void insertWord(){
        // insert an word in a given text;
        String str = "Fahad Kader";

        StringBuilder sb = new StringBuilder(str);
        sb.insert(5,"XXX");
        System.out.println(sb);

    }

    public static void last3WordOfText(){
        // print the last 3 word of a given text
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

//        String s = str.substring(str.length()-3, str.length());
//        System.out.println(s);

        char[] ch = str.toCharArray();
        String s = "";
        for (int i =ch.length-1; i>= ch.length-3;i--){
            s = ch[i] +s ;
        }
        System.out.println(s);

    }

    public static void printHalfText(){
        // print half of the given text
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        int half = str.length()/2;
        String s = str.substring(0,half);

        System.out.println(s);

    }

    public static void findNUmOfElement(){
        int[]arr = {1,2,3,4,5,6,7,8,9,0,0,0,0};

        int numbers = arr.length;

        System.out.println("Number of elements : "+ numbers);
    }
}
