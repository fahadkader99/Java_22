package qA_Fox;

import java.util.Scanner;

public class PowerOfNum {
    // find a power of a number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int initial = sc.nextInt();
        int num = initial;
        System.out.println("Enter the power: ");
        int power = sc.nextInt();


        for (int i =1; i <power; i++){
            num = num * initial;
        }
        System.out.println("THe "+ initial+" power "+ power+" is: "+ num);



    }
}
