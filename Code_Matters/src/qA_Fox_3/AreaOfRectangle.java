package qA_Fox_3;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        // java program which intakes width and height of a Rectangle and there by print its area.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        int w = sc.nextInt();
        System.out.println("Enter length:");
        int l = sc.nextInt();

        int area = w * l;

        System.out.println(area);


    }
}
