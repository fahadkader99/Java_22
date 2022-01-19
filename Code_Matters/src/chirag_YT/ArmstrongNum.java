package chirag_YT;

import java.util.Scanner;

public class ArmstrongNum {

    //Armostrong:
    /*
    in: 153 - 1^3+5^3+3^3 = 153     -  armstrong
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();
        int original = num;

        int rev = 0;
        while (num>0){
            rev = rev+(num%10)*(num%10)*(num%10);
            num=num/10;
        }
        //System.out.println(rev);
        if (original==rev){
            System.out.println("Armstrong");
        }else System.out.println("Not Armstrong");

    }
}
