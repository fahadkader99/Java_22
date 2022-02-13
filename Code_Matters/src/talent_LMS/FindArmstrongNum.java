package talent_LMS;

import java.util.Scanner;

public class FindArmstrongNum {
    // find if the mum is Armstrong or not. ex: 153, 371, 407, 8208.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();
        int ori = num;
        int arm = 0;

        while (num>0){
           int remainder = num %10;
           arm = arm + (remainder * remainder * remainder);
           num = num / 10;
        }
        System.out.println(arm);

        if (ori==arm){
            System.out.println("Armstrong");
        }else System.out.println("Not Armstrong");

//        int n = 12;
//        n = n % 10;
//        System.out.println(n);

    }
}
