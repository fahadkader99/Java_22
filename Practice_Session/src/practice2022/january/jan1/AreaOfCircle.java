package practice2022.january.jan1;

import java.util.Scanner;

public class AreaOfCircle {
    // find the area of Circle
    // formula is :  A = pi * radius squared.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of circle");
        int r = input.nextInt();

        double circle = 0;
        circle = 3.14 * (r*r);
        System.out.println("The area of circle is: "+ circle);
    }
}
