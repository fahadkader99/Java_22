package practice2022.january.jan2;

import java.util.Scanner;

public class StringContainDigit {
    //How do you check if a string contains only digits?

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = input.nextLine();

        boolean isDigit = false;
        String empty = "";

        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                empty = str.charAt(i)+empty;
                isDigit = true;
            }
        }
        if (isDigit){
            System.out.println("The digit "+ empty);
        }else System.out.println("No digit...!");



    }
}
