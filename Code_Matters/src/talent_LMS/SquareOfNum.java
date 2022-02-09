package talent_LMS;

import java.util.Scanner;

public class SquareOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Square of "+num+" is "+ (num*num));


    }

}