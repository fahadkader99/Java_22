package talent_LMS;

import java.util.Scanner;

public class AreaOfRectangle {
    /*
    Write a Method which will calculate the area and perimeters of a Rectangle.


Expected:

In main method call the newly created method three times with three different values.
    A = w * l
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width ");
        int w = sc.nextInt();
        System.out.println("Enter the Length: ");
        int l = sc.nextInt();

        AreaOfRectangle area = new AreaOfRectangle();
        area.calculateRectangle(w,l);

    }
    public void calculateRectangle(int w, int l){
        int rectangleArea = w * l;

        System.out.println("Area of Rectangle is: "+ rectangleArea);
    }
}
