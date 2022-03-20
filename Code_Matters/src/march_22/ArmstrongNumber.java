package march_22;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        m1(num);

    }
    public static void m1(int num){
        int temp =num;
        int arm = 0;
        while (num>0){
            int digit = num %10;
            arm += digit*digit*digit;
            num = num / 10;
        }

        if (temp==arm){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
}
