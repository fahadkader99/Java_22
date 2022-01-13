package practice_session.Array.Single_Dimension;

import java.util.Scanner;

public class FindMaxMin_Loop {
    public static void main(String[] args) {

        double[] number = new double[5];
        double sum = 0;


        System.out.println("Enter 5 numbers: ");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }

        double avg = sum / number.length;
        System.out.println("The sum is: " + sum);
        System.out.println("The avg is: " + avg);

        findMax(number);
        findMin(number);

    }

    public static void findMax(double [] number) {

        double max = number[0];


        for (int i = 1; i < 5; i++) {
            if (max < number[i]) {
                max = number[i];
            }

        }
        System.out.println("Max is : " + max);

    }

    public static void findMin(double [] number) {

        double min = number[0];
        for (int i = 1; i < 5; i++) {
            if (min > number[i]) {
                min = number[i];
            }

        }
        System.out.println("Min is: " + min);
    }


}
