package practice_session.Basics_Code;

import java.util.Scanner;

public class Greatest_Num_Between_3_Num {
    //find the greatest number between 3 numbers:
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        System.out.println("Input 3 numbers to find the greatest: ");
        int a = i.nextInt();
        int b = i.nextInt();
        int c = i.nextInt();

    Greatest_Num_Between_3_Num n = new Greatest_Num_Between_3_Num();
    n.findGreatest(a,b,c);

    }
    public int findGreatest(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println("Greatest is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Greatest is: " + b);
        } else if (c > a && c > b) {
            System.out.println("Greatest is: " + c);
        } else {
            System.out.println("Try again");
        }
        return 0;
    }

}
