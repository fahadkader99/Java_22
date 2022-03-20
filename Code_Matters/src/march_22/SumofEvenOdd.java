package march_22;

import java.util.Scanner;

public class SumofEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int eSum = 0;
        int oSum = 0;

        for (int i = 0; i<=num;i++){
            if (i % 2 ==0){
                eSum += i;
            }
        }

        for (int i = 1; i<=num;i++){
            if (i % 2 != 0){
                oSum +=i;
            }
        }
        System.out.println("Odd: "+oSum+"\nEvenSum: "+ eSum);
    }
}
