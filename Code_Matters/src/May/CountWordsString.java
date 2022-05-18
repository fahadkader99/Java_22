package May;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsString {
    // count all the words in a string

    public static void main(String[] args) {
        String a = "Ashikul Kader Fahad";

       // words1(a);
        countWord();


    }

    public static void words1(String a){
        String [] b = a.split("\\s+");
        System.out.println(b.length);
    }

    public static void countWord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String  a = sc.nextLine().trim();

        int count = 1;

        for (int i = 0; i<a.length()-1; i++){

            if ((a.charAt(i)==' ')&& (a.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("No. of WOrds: "+ count);

    }


}
