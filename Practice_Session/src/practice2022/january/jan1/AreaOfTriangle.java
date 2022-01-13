package practice2022.january.jan1;

import java.util.Scanner;

public class AreaOfTriangle {
    // formula to find triangle = (height * width) / 2 .
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter height");
        int h = input.nextInt();
        System.out.println("Enter width ");
        int w = input.nextInt();

        double triangle = (h * w) / 2;
        System.out.println("Area of Triangle "+ triangle);


    }
}
