package naveen_Automation;

import org.testng.annotations.Test;

import java.util.Scanner;

public class NumberFromString {
     // find the sum of number from  string


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with Number ");
        String st = sc.nextLine();
        sc.close();
        String str = st;
        int sum = 0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                int a = Integer.parseInt(String.valueOf(ch));
                sum+= a;
            }
        }
        System.out.println("\nSum " + sum);
    }
}
