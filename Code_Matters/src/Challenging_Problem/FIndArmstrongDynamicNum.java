package Challenging_Problem;

import java.util.Scanner;

public class FIndArmstrongDynamicNum {
    // find the num of dynamic number
    // ex: 153 / 8208 / 407 / 371 / 1634

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        // using methods
        int length = findLength(num);
        boolean armstrong = isArmstrong(num,length);

        if (armstrong){
            System.out.println("Number is armstrong");
        }else {
            System.out.println("Not armstrong");
        }


    }
    public static int findLength(int num){
        int length = 0;
        while (num>0){
            num = num/10;
            length++;
        }
        System.out.println("Length of the num is: "+length);
        return length;
    }
    public static boolean isArmstrong(int num, int length){
        int temp = num;
        int sum = 0;

        while (temp>0){
            int digit = temp %10;
            sum = (int) (sum+Math.pow(digit,length));
            temp = temp/10;
        }

        if (sum==num){
            return true;
        }else {
            return false;
        }
    }
}
