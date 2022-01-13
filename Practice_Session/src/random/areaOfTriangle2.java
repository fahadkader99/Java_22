package random;

import java.util.Scanner;

public class areaOfTriangle2 {
    public static void main(String[] args) {

        int a,b,c;
        float s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 3 numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        s = (a+b+c)/2f;
        System.out.println("THe total area is: " + s);


    }
}
