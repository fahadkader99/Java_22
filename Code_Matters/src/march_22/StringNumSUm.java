package march_22;

import java.util.Scanner;

public class StringNumSUm {
    // sum up the digits in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with Num");
        String str = sc.nextLine();

        int sum = 0;

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (Character.isDigit(ch)){
                int n = Integer.parseInt(String.valueOf(ch));
                sum = sum+n;
            }

        }
        System.out.println("Sum of the digits are: "+ sum);


    }
}
