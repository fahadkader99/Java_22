package rough_and_tough_2;

import java.util.Scanner;

public class CountNumOfCharInString {

    // count the number of char in a string:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();


        int count = 0;
        for (int i =0; i<str.length();i++){
            if (str.charAt(i) !=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
