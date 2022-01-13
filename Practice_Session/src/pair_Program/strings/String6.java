package pair_Program.Strings;

import java.util.Scanner;

public class String6 {
    //How do you check if a string contains only digits?
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Line as you wish!!! ");
        String str = input.nextLine();

        String6 s = new String6();
        s.isDigit(str);


    }

    public String isDigit(String str) {

        String s = "";
        boolean isDigit = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                s = str.charAt(i) + s;
                isDigit = true;
            }
        }
        if (isDigit){
            System.out.println("The Digit: "+ s);
        }else System.out.println("No Digit !");
        return s;
    }
}