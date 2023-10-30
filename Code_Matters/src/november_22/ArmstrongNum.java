package november_22;

import java.util.Scanner;

public class ArmstrongNum {
    // check the number is Armstrong or not.
    // 153 = 1*1*1 + 5*5*5 + 3*3*3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int a = sc.nextInt();
        int b = a;
        sc.close();
        int arm = 0;

        while (b!=0){
            int rem = b%10;
            arm = arm + (rem*rem*rem);
            b = b/10;
        }
        if (a==arm){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }




    }
}
