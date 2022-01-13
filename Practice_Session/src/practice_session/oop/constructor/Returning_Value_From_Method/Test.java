package practice_session.oop.constructor.Returning_Value_From_Method;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter value to find square: ");
        int value = input.nextInt();

        ReturningValueDemo findValue = new ReturningValueDemo();        // default constructor will be used.
        System.out.println("Result = "+ findValue.square(value));

    }
}
