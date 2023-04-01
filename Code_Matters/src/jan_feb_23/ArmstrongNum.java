package jan_feb_23;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int c = sc.nextInt();
        int a = c;
        sc.close();

        int arm = 0;
        while (a != 0){
            int rem = a % 10;
            arm = arm+ (rem* rem * rem);
            a = a/10;
        }
        System.out.println(arm);
        if (c==arm){
            System.out.println("\nArmstrong");
        }else {
            System.out.println("\nNot Armstrong");
        }



    }
}
