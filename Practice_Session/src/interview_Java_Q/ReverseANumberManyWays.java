package interview_Java_Q;

import java.util.Scanner;

public class ReverseANumberManyWays {
    // reverse a number 3 ways

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt();

        logic1(num);


    }
    static void logic1(int num){    // using Algorithm
        int reverse = 0;

        while (num != 0){
            reverse = reverse*10 + num%10;
            num = num / 10;
        }
        System.out.println("Reverse Num: "+ reverse);



    }

}
