package practice_session.oop.exceptions;

import java.util.Scanner;

public class ExceptionProblem {
    public static void main(String[] args) {

//        while (true) {        // here program will keep looping always.
//            try {
//                Scanner input = new Scanner(System.in);
//                System.out.print("Enter num1: ");
//                int num1 = input.nextInt();
//                System.out.print("Enter num2: ");
//                int num2 = input.nextInt();
//
//                int result = num1 / num2;
//                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
//
//
//            } catch (Exception e) {
//                System.out.println("Exception: " + e);
//                System.out.println("You must enter integer, Please try again. ");
//            }
//        }
//



        // here program will keep running until it got an answer. when it will get result, the count will be e
        // equal to 1 and the loop will stop.
        int count = 1;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter num1: ");
                int num1 = input.nextInt();
                System.out.println("Enter num2: ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                count = 2;

            }catch (Exception e){
                System.out.println("Exception: " + e);
                System.out.println("You must enter integer, Please try again. ");
            }
        }while (count==1);


    }
}
