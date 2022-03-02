package rough_and_tough_2;

import java.util.Scanner;

public class ArmstrongNum {
    // find a armstrong num. ex: 153.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to check: ");
        int num = sc.nextInt();
        int original = num;

        int sum = 0;
        while (num>0){
            sum = sum+(num%10)*(num%10)*(num%10);
            num = num/10;
        }

        System.out.println(sum);

        if (original==sum){
            System.out.println("Armstrong");
        }else System.out.println("Not armstrong!");



    }
}
