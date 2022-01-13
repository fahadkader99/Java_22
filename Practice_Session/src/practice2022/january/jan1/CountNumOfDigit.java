package practice2022.january.jan1;

import java.util.Scanner;

public class CountNumOfDigit {
    // count number of a given digit
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int num = input.nextInt();

        int count = 0;
//
//        for (int i = 0; i < num; i++){
//            if (num > 0){
//                num = num / 10;
//                count++;
//            }
//        }
        //System.out.println("Total Digit: "+ count);

        while (num > 0){
            num = num / 10;
            count++;
        }

        System.out.println("Digits: "+ count);

    }
}
