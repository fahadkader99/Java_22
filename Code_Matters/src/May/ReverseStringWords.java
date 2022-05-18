package May;

import java.util.Arrays;

public class ReverseStringWords {

    // reverse all the words in a line

    public static void main(String[] args) {

        reverseLine();


    }
    public static void reverseLine(){
        String s = "I am Ashikul Kader Fahad";

        String[]str = s.split("\\s+");

        String a = "";

        for (int i = str.length-1; i>=0;i--){
            a+= str[i]+" ";
        }
        System.out.println(a);




    }
}
