package march_april_23;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceCharWithOccuranceNum {
    // replace a char with its occurance Num in string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine().toUpperCase().trim();
        System.out.println("Enter a char to check occurrence: ");
        char charToReplace = sc.nextLine().toUpperCase().charAt(0);
        sc.close();

        // 1st check if the char is present in the string
        if (input.indexOf(charToReplace) == -1){                                        // if found then indexOf will return the index of the char
            System.out.println("Given char isn't available in the String");
            System.exit(0);                                                     // exit from the system | stop execution & next other code won't execute
        }

        // logic to replace char occurance in string
        char[] arr = input.toCharArray();
        int count = 1;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == charToReplace){
                arr[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println("\nAfter replacing: " + Arrays.toString(arr));

    }
}
