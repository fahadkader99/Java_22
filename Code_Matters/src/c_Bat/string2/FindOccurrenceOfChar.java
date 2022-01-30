package c_Bat.string2;

import java.util.Scanner;

public class FindOccurrenceOfChar {
    // find the occurrence of a char in a string:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter the char you looking for");
        char target = sc.next().charAt(0);


        int count = 0;
        for (int i = 0; i<str.length();i++){
            if (str.charAt(i)==target){
                count++;
            }
        }
        System.out.println(count);



    }
}
