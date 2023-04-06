package march_april_23;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceCharOccurrance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine().trim().toLowerCase();
        System.out.println("Enter char to find occurrence: ");
        char repeated = sc.nextLine().toLowerCase().charAt(0);
        sc.close();

        findOccurrence(a, repeated);
    }

    static void findOccurrence(String str, char repeated){
        int count = 1;

        // check if the sting has the char or not
        if (str.indexOf(repeated) == -1){
            System.out.println("\nCharacter not found in the String...!");
            System.exit(0);
        }

        // check & replace with the count
        char[] ch = str.toCharArray();

        for (int i = 0; i<ch.length; i++){
            if (ch[i] == repeated){
                ch[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }

        System.out.println("\nAfter replacing : " + Arrays.toString(ch));
        System.out.println("\nAfter replacing : " + new String (ch));

    }
}
