package talent_LMS;

import java.util.Scanner;

public class AreaOfTriangle {
    // calculate the area of triangle

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of triangle");
        int w = sc.nextInt();
        System.out.println("Enter height of triangle");
        int h = sc.nextInt();


        int area = (h*w)/2;
        System.out.println("The area of triangle is: "+ area);


    }
}
