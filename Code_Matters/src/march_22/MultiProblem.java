package march_22;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MultiProblem {
    // find a square root of a number
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//
//        double d = Math.sqrt(num);
//        System.out.println(d);


        //reverseArrayWithCollection();
        //receiveInputToArray();
        //reverseArrayElements();
        //reverseWordInString();
        //findReminderWithoutMod();
        insertWordInMiddleOfString();


    }
    public static void reverseArrayWithCollection(){
        String[] str = {"a","b","c"};

        List<String > list = Arrays.asList(str);

        Collections.reverse(list);

        System.out.println(list);


    }
    public static void receiveInputToArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");

        int[] num = new int[sc.nextInt()];

        for (int i = 0; i<num.length;i++){
            System.out.println("Enter the elements: "+(i+1));
            num[i] = sc.nextInt();
        }

        for (Integer i : num){
            System.out.print(i+" ");
        }


    }
    public static void reverseArrayElements(){
        String [] str = {"a","b","c","d","E"};

        for (int i = 0; i<str.length / 2;i++){
           String temp = str[i];
           str[i] = str[str.length-i -1];
           str[str.length-i -1] = temp;
        }

        for (String s : str){
            System.out.print(s+" ");
        }
    }
    public static void reverseWordInString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        String s = str.replaceAll("\\s{2,}"," ").trim();

        System.out.println(s);

        String [] result = s.split(" ");
        String r = "";

        for (int i = result.length-1; i>=0; i--){
            r+=result[i]+" ";
        }

        System.out.println(r);



    }
    public static void findReminderWithoutMod(){
        int a = 10;
        int b = 5;

        int dividend = a/b;
        int remainder = a - (dividend*b);
        System.out.println(remainder);
    }

    public static void insertWordInMiddleOfString(){
        String s = "Ashikul KAder Fahad";

//        StringBuilder stringBuilder = new StringBuilder(s);
//        stringBuilder.insert(2,"AXX");
//        System.out.println(stringBuilder);

        String str = s.substring(0,4)+"XXX"+s.substring(4);
        System.out.println(str);
    }
}
