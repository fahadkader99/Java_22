package practice2022.january.jan1;

import java.util.Scanner;

public class AreaOfSquare {
    // find the area of square. formula = A = a * a;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter Radius of circle");
        double area = input.nextDouble();

        double square = area*area;
        System.out.println("Area of Square: "+ square);

    }
}
