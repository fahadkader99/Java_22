package november_22;

import java.util.Scanner;

public class ReverseWordsSentence {
    // reverse the words in a sentence
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a Sentence ");
        String a = scanner.nextLine().trim();
        String b = a;
        /*
        - break down the word into  array
        - reverse the array
         */
        String [] str = b.split("\\s+");

       // List<String > list = new ArrayList<>();
        String d = "";

        for (int i= str.length-1; i>=0; i--){
           // list.add(str[i]);
            d+=str[i]+" ";
        }
        System.out.println("\nReversed: " + d);

//
//        StringBuilder sb = new StringBuilder();
//        for (String c : list){
//            sb.append(c+" ");
//        }
       // System.out.println("Reversed: " + sb);


    }


}
