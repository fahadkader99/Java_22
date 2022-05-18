package May;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num2 = sc.nextInt();

        int num = num2;
        int arm = 0;
        int rem = 0;

        while (num!=0){
            rem = num%10;
            arm = arm+ (rem * rem * rem);
            num = num/10;
        }

        if (num2==arm){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not arm");
        }
        //System.out.println(arm);
    }
}
