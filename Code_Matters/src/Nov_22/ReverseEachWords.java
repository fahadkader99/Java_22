package Nov_22;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachWords {
    // reverse each words in a sentence

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String a = sc.nextLine().trim().toLowerCase();
        sc.close();
        String b = a;

        /*
        - split into array
        - reverse each array elements
         */

        String [] str = b.split("\\s");         // Regex - \\s means space
        //System.out.println(Arrays.toString(str));   // Now reverse the Array[i]
        String revStr = "";

        for (int i=0; i<str.length; i++){

            String revWord = "";

            for (int j = str[i].length()-1; j >=0; j--){

                revWord+=str[i].charAt(j);

            }

            revStr+=revWord+" ";
        }

        System.out.println(revStr);

    }
}
