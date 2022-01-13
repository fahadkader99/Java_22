package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AreaOfTriangle {
    /*
    Find out area of triangle:
    Area = (base*height) / 0.5
     */

    public static void main(String[] args){
        double base, height, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base: ");
        base = input.nextDouble();
        System.out.println("Enter Height: ");
        height = input.nextDouble();
        area = 0;
        getArea(base, height, area);
        System.out.println("The area is: " + getArea(base, height, area));
    }
    public static double getArea(double base, double height, double area){
        area = (base * height) / 2;
        return area;



    }
}
