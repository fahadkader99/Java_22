package a_practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {

    // Reverse the words in a sentence

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String a = sc.nextLine().trim();
        sc.close();

        String [] arr = a.split("\\s+");

        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
