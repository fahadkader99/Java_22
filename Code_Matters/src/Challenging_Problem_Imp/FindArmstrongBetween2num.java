package Challenging_Problem_Imp;

import java.util.Scanner;

public class FindArmstrongBetween2num {
    // find all the armstrong number between 2 pointer
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        findArmstrong(a,b);

    }
    public static void findArmstrong(int a, int b){
        for (int i = a; i<=b;i++){
            int num = i;
            int sum = 0;

            while (num>0){
                int remainder = num%10;
                sum = sum+(remainder*remainder*remainder);
                num = num/10;
            }
            if (sum==i){
                System.out.println(sum);
            }
        }
    }
}
