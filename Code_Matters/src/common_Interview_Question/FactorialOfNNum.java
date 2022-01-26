package common_Interview_Question;

import java.util.Scanner;

public class FactorialOfNNum {
    // Find factorial of a given num: it is a function that multiplies all the number below it.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int factor = 1;
        for (int i = 1; i <=num;i++){
            factor *=i;
        }

        System.out.println(factor);



    }
}
