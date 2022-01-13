package w3School;

import java.util.Scanner;

public class InchToMeter {
    /*
    Write a Java program that reads a number in inches, converts it to meters.
Note: One inch is 0.0254 meter

Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
     */

    public static void main(String[] args) {

     printMeter();

    }
    public static double printMeter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Inch number: ");
        double inch =input.nextDouble();
        double meter = inch * 0.0254;

        System.out.println(inch + "inch is = " + meter + "in meter");

        return meter;


    }
}
