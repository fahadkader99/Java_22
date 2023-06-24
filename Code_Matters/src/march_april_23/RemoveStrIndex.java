package march_april_23;

import java.util.Scanner;

public class RemoveStrIndex {
    /*
    Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine().trim();
        System.out.println("Enter index to remove: ");
        int index = sc.nextInt();
        sc.close();

        removeIndex(a, index);

    }

    static void removeIndex(String str, int index){

        String a = "";
        char[] ch = str.toCharArray();

        if (index < str.length()){

            for (int i = 0; i <ch.length; i++){

                if (i != index){
                    a += ch[i];
                }

            }
            System.out.println("After removing " + index+ " index = " +a);

        }
        else {
            System.out.println("Index not available in the string.. . . . ");
        }

    }
}
