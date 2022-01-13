package pair_Program.Strings;

import java.util.*;

public class String9 {
    //How do you count the occurrence of a given character in a string?

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a String to find a occurrence: ");
        String s = input.nextLine();
        System.out.println("\nEnter the char you want to know the occurrence: ");
        char c = input.next().charAt(0);

        char[] arr = s.toCharArray();

        int count = 0;

        for (int i =0; i < arr.length; i++){
            if (arr[i]== c){
                count++;
            }
        }
        System.out.println("No of Occurrence: "+ count);

    }
}
