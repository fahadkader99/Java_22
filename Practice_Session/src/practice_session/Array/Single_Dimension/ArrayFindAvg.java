package practice_session.Array.Single_Dimension;

import java.util.Scanner;

public class ArrayFindAvg {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double [] number = new double[5];
        double sum = 0;

        System.out.println("Enter 5 numbers: ");
//        number[0] = input.nextDouble();
//        number[1] = input.nextDouble();
//        number[2] = input.nextDouble();
//        number[3] = input.nextDouble();
//        number[4] = input.nextDouble();
//
//
//        sum = number[0] + number[1] + number[2] + number[3] + number[4];
//        System.out.println("The sum is: " + sum);

        findSum(number,input,sum);

    }       // same code has been optimized below:

    public static void findSum(double [] number, Scanner input, double sum){

        for (int i = 0; i < number.length; i++){        // for loop for taking input 5 times.
            number[i] = input.nextDouble();     // using for loop for taking input 5 times.
        }

        for (int i = 0; i < number.length; i ++){
            sum = sum + number[i];
        }

        double avg = sum / number.length;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);

    }
}
