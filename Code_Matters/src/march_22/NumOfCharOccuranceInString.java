package march_22;

import java.util.Scanner;

public class NumOfCharOccuranceInString {
    // find out the number of char appear in the string;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i<str.length();i++){
            for (int j = i+1; j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                    System.out.println();
                }
            }
        }


    }
}
