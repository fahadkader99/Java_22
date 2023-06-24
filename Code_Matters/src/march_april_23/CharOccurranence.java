package march_april_23;

import java.util.Scanner;

public class CharOccurranence {
    // find the char occurrence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine().toLowerCase().trim();
        System.out.println("Enter char to find: ");
        char ch = sc.nextLine().toLowerCase().charAt(0);
        sc.close();

        findOccurrence(str, ch);
    }

    static void findOccurrence(String str, char ch){
        int count = 1;
        char [] arr = str.toCharArray();

        if (str.indexOf(ch) == -1){
            System.out.println("\nChar occurrence not found. Try Again. . . ");
            System.exit(0);
        }

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == ch){
                arr[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println("\nAfter replacement: " + new String(arr));
    }
}
