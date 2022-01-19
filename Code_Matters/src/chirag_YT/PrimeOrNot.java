package chirag_YT;

import java.util.Scanner;

public class PrimeOrNot {
    // check given number prime or not
    // Prime num: is a number that is dived by 1 and the number by itself. so for prime num divisor will be always 2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <=num;i++){
            if (num%i==0){
                count++;
            }
        }

        if (count==2){
            System.out.println("Prime");
        }else System.out.println("Not Prime");





    }
}
