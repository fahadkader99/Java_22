package qA_Fox;

import java.util.Scanner;

public class ParameterOfCircle {

    /*
    Radius is the center to the border of the circle.
    Perimeter of the circle is 2 * Pi * r.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = sc.nextInt();

        double parameter = 2* Math.PI * radius;

        System.out.println(parameter);


    }

}
