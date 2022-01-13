package practice_session.oop.exceptions;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num for X : ");
        int x = scan.nextInt();
        System.out.println("Enter num for Y : ");
        int y = scan.nextInt();



        ExceptionHandling a = new ExceptionHandling();
        //a.withoutHandle(x, y);
        a.withHandle(x,y);


    }
    public void withoutHandle(int x, int y){
        int result = x / y;
        System.out.println("Result = "+ result);
        System.out.println("Last line of the program");

    }
    public void withHandle(int x, int y){

        try {
            int result = x/y;
            System.out.println("Result = "+ result);
        }
        catch (ArrayIndexOutOfBoundsException A){
            System.out.println("Exception: "+ A);
            System.out.println("Wrong Input. Try Again....!");

        }
        catch (Exception E){
            System.out.println("Exception: "+ E);
            System.out.println("Wrong Input. Try Again....!");

        }
//        finally {
//            System.out.println("Skipping the Exception by using Finally and Now you are looking at the exception: ");
//        }

        System.out.println("Last line of the program");
        System.out.println("Exception is taken care of and the code goes on.....");

    }
}
