package random;

import java.util.Scanner;

public class AreaOfTriangle3 {
    // find area of triangle using 3 sights, by taking in put from user:

    public static void main(String[] args) {

        int a, b , c;
        float s, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number for 3 sights: ");
        int sight1 = input.nextInt();

        System.out.println("Enter 2nd number for 3 sights: ");
        int sight2 = input.nextInt();

        System.out.println("Enter 3rd number for 3 sights: ");
        int sight3 = input.nextInt();
        s = 0;
        area = 0;

        findS(sight1, sight2, sight3, s, area);

        System.out.println("The area of 3 sights are: " + findS(sight1, sight2, sight3, s, area));

    }
    public static float findS(int sight1, int sight2, int sight3, float s, float area){
        s = (sight1 + sight2 + sight3) / 2f;

        findArea(sight1, sight2, sight3, s, area);
        return s;

    }
    public static float findArea(int sight1, int sight2, int sight3, float s, float area){
      area = (float) Math.sqrt(s*((s-sight1)*(s-sight2)*(s-sight3)));
      return area;
    }
}
