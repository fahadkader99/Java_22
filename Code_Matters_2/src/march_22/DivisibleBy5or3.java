package march_22;

import java.util.Scanner;

public class DivisibleBy5or3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();

        //singleDivisible(num);
        rangeDivisible(num);


    }
    public static void singleDivisible(int num){
        if (num % 5 ==0 && num % 3==0){
            System.out.println("Divisible by 5 & 3 ");
        }else System.out.println("Not Divisible");
    }

    public static void rangeDivisible(int num){
        // print the numbers who are divisible by 5 or 3 from the given range

        for (int i = 0; i<=num;i++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.print(i+" ");
            }
        }
    }

}
