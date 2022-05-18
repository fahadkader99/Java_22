package May;

import java.util.Arrays;

public class ReverseWordStr {
    // reverse each word in a string

    public static void main(String[] args) {
        String name = "Ashikul Kader Fahad";

        reverseWord(name);


    }
    public static void reverseWord(String name){

        String [] str = name.split("\\s+");
        System.out.println(Arrays.toString(str));
        String a = "";

        for (int i = str.length-1; i>=0; i--){
            a+= str[i] + " ";
        }
        System.out.println(a);

    }
}
